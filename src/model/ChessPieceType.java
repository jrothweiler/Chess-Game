package model;

/**
 * Piece type enumeration
 */
public enum ChessPieceType {

  PAWN, ROOK, BISHOP, KNIGHT, KING, QUEEN, NONE;

  @Override
  public String toString() {
    switch (this) {
      case PAWN:
        return "P";
      case ROOK:
        return "R";
      case BISHOP:
        return "B";
      case KNIGHT:
        return "N";
      case KING:
        return "K";
      case QUEEN:
        return "Q";
      default:
        return " ";
    }
  }
}
