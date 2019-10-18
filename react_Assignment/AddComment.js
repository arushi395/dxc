import React, { Component } from 'react';
import DisplayAddedComment from './DisplayAddedComment';

class AddComment extends Component {
    constructor()
    {
        super()
        this.state=({
            comments :[],
            comment: "enter comment"
        })
    }
    changeComment=(ourData)=>{
        this.setState({
            comment: ourData.target.value
        })
    }
    addComment =(ourData) => {
        this.setState({
            comments: this.state.comments.concat([this.state.comment]),
            comment :""
        })
        ourData.preventDefault();
    }
    render() {
        return (
            <div>
                <form onSubmit={this.addComment} className="form-group">
                    Comment :<input type="text" value={this.state.comment} className="form-control" onChange={this.changeComment}></input>
                    <br/>
                    <button>ADD</button>
                </form>
            <DisplayAddedComment items={this.state.comments}></DisplayAddedComment>
            </div>
        );
    }
}

export default AddComment;