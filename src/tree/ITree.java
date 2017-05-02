package tree;

import domain.copy.IDeepCopy;
import tree.node.ITreeNode;
import util.searchable.ISearchableByFilter;

public interface ITree<TREETYPE> extends IDeepCopy, ISearchableByFilter<ITreeNode<TREETYPE>> {

}
