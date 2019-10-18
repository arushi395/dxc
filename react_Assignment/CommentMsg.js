import React, { Component } from 'react';
import EditMsg from './EditMsg';

class CommentMsg extends Component {
    constructor(){
        super()
        this.state=({
            edit :false,
            message : "",
            displayMsg:"",
            buttonText :"ADD"
        })
        this.updateComment=this.updateComment.bind(this)
        this.changeComment=this.changeComment.bind(this)
        this.editComment=this.editComment.bind(this)
    }
    changeComment(ourData){
        this.setState({message:ourData.target.value})
    }
    updateComment(ourData){
        this.setState(prevS =>({
            buttonText :"EDIT",
            displayMsg : this.state.message,
            message: "",
            edit:true
        }))
        ourData.preventDefault();
    }
    editComment(ourData){
        ourData.preventDefault();
        this.setState(prevS=>({
            edit:false,
            message:this.state.displayMsg,
            //displayMsg: "",
            buttonText :"ADD"
        }))        
    }
    render() {
        let buttonAction
        if(this.state.edit)
            buttonAction=this.editComment
        else
            buttonAction=this.updateComment
        return (
            <div>
                <form className="form-group">
                <div>COMMENT : <input type="text" value={this.state.message} onChange={this.changeComment} className="form-control"></input>
            <br/><button onClick={buttonAction}>{this.state.buttonText}</button></div>
                    
                <EditMsg display={this.state.displayMsg}></EditMsg>
                    
                </form>
            </div>
        );
    }
}

export default CommentMsg;