import React, { Component } from 'react';

class DisplayAddedComment extends Component {
    render() {
        var createItem = function(itemText) {
            return <li>{itemText}</li>;
        };
    return <ul>{this.props.items.map(createItem)}</ul>;
    }
}

export default DisplayAddedComment;