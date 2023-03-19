package AST;
import Visitor.Visitor;

import java.util.ArrayList;

public class VarDeclNode extends AST {

    public VarDeclNode(AST parentNode, ArrayList<AST> childNodes, Object concept, int depth) {
        super(parentNode, childNodes, concept, depth);
    }

    public void accept(Visitor p_visitor) {
        p_visitor.visit(this);
    }

}