package controller.Commands;

import controller.ChessController;
import model.ChessPieceType;
import model.IChessModel;
import view.IChessView;

/**
 * Command designates a pawn to be promoted to a rook
 */
public class PromoteRookCommand implements IKeyCommand {

  @Override
  public void execute(IChessModel model, IChessView view) {
    model.promote(ChessPieceType.ROOK);
    view.redraw();

    view.deleteButtonListener();
    view.deleteKeyListener();

    ChessController c = new ChessController();
    c.setModel(model);
    c.setView(view);

    view.setMessage(model.currentPlayer().s + "'s move.");
  }
}
