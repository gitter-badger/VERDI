/* Generated By:JJTree&JavaCC: Do not edit this line. ParserTokenManager.java */
package anl.verdi.parser;

public class ParserTokenManager implements ParserConstants
{
//  public  java.io.PrintStream debugStream = System.out;		// 2014 not used
//  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }	// 2014 not used
private final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x3dfffffe000000L) != 0L)
         {
            jjmatchedKind = 57;
            return 37;
         }
         if ((active0 & 0x2000000000000L) != 0L)
            return 37;
         if ((active0 & 0x400000L) != 0L)
            return 26;
         return -1;
      case 1:
         if ((active0 & 0x39ffffbe000000L) != 0L)
         {
            jjmatchedKind = 57;
            jjmatchedPos = 1;
            return 37;
         }
         if ((active0 & 0x4000040000000L) != 0L)
            return 37;
         return -1;
      case 2:
         if ((active0 & 0x38002000000000L) != 0L)
         {
            if (jjmatchedPos != 2)
            {
               jjmatchedKind = 57;
               jjmatchedPos = 2;
            }
            return 37;
         }
         if ((active0 & 0x1ffdfbe000000L) != 0L)
            return 37;
         return -1;
      case 3:
         if ((active0 & 0x38000000000000L) != 0L)
         {
            jjmatchedKind = 57;
            jjmatchedPos = 3;
            return 37;
         }
         if ((active0 & 0x7fbc04000000L) != 0L)
            return 37;
         return -1;
      case 4:
         if ((active0 & 0x20000000000000L) != 0L)
         {
            jjmatchedKind = 57;
            jjmatchedPos = 4;
            return 37;
         }
         if ((active0 & 0x18000000000000L) != 0L)
            return 37;
         return -1;
      case 5:
         if ((active0 & 0x20000000000000L) != 0L)
         {
            jjmatchedKind = 57;
            jjmatchedPos = 5;
            return 37;
         }
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private final int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private final int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
private final int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 33:
         return jjMoveStringLiteralDfa1_0(0x10000L);
      case 37:
         return jjStopAtPos(0, 23);
      case 38:
         return jjMoveStringLiteralDfa1_0(0x40000L);
      case 40:
         return jjStopAtPos(0, 55);
      case 41:
         return jjStopAtPos(0, 56);
      case 42:
         jjmatchedKind = 21;
         return jjMoveStringLiteralDfa1_0(0x1000000L);
      case 43:
         return jjStopAtPos(0, 19);
      case 45:
         return jjStopAtPos(0, 20);
      case 47:
         return jjStartNfaWithStates_0(0, 22, 26);
      case 59:
         return jjStopAtPos(0, 54);
      case 60:
         jjmatchedKind = 12;
         return jjMoveStringLiteralDfa1_0(0x4000L);
      case 61:
         return jjMoveStringLiteralDfa1_0(0x2000L);
      case 62:
         jjmatchedKind = 11;
         return jjMoveStringLiteralDfa1_0(0x8000L);
      case 69:
         return jjStartNfaWithStates_0(0, 49, 37);
      case 78:
         return jjMoveStringLiteralDfa1_0(0x38000000000000L);
      case 80:
         return jjMoveStringLiteralDfa1_0(0x4000000000000L);
      case 97:
         return jjMoveStringLiteralDfa1_0(0x2000000L);
      case 99:
         return jjMoveStringLiteralDfa1_0(0x900000000L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x20000000L);
      case 108:
         return jjMoveStringLiteralDfa1_0(0x50000000L);
      case 109:
         return jjMoveStringLiteralDfa1_0(0x1ffa000000000L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x448c000000L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x1200000000L);
      case 124:
         return jjMoveStringLiteralDfa1_0(0x20000L);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
private final int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 38:
         if ((active0 & 0x40000L) != 0L)
            return jjStopAtPos(1, 18);
         break;
      case 42:
         if ((active0 & 0x1000000L) != 0L)
            return jjStopAtPos(1, 24);
         break;
      case 61:
         if ((active0 & 0x2000L) != 0L)
            return jjStopAtPos(1, 13);
         else if ((active0 & 0x4000L) != 0L)
            return jjStopAtPos(1, 14);
         else if ((active0 & 0x8000L) != 0L)
            return jjStopAtPos(1, 15);
         else if ((active0 & 0x10000L) != 0L)
            return jjStopAtPos(1, 16);
         break;
      case 67:
         return jjMoveStringLiteralDfa2_0(active0, 0x10000000000000L);
      case 73:
         if ((active0 & 0x4000000000000L) != 0L)
            return jjStartNfaWithStates_0(1, 50, 37);
         break;
      case 76:
         return jjMoveStringLiteralDfa2_0(active0, 0x20000000000000L);
      case 82:
         return jjMoveStringLiteralDfa2_0(active0, 0x8000000000000L);
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x1551200000000L);
      case 98:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000000L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000000000L);
      case 105:
         return jjMoveStringLiteralDfa2_0(active0, 0xaa8480000000L);
      case 110:
         if ((active0 & 0x40000000L) != 0L)
            return jjStartNfaWithStates_0(1, 30, 37);
         break;
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x910000000L);
      case 113:
         return jjMoveStringLiteralDfa2_0(active0, 0xc000000L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x4000000000L);
      case 120:
         return jjMoveStringLiteralDfa2_0(active0, 0x20000000L);
      case 124:
         if ((active0 & 0x20000L) != 0L)
            return jjStopAtPos(1, 17);
         break;
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private final int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 69:
         return jjMoveStringLiteralDfa3_0(active0, 0x20000000000000L);
      case 79:
         return jjMoveStringLiteralDfa3_0(active0, 0x18000000000000L);
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000000000L);
      case 103:
         if ((active0 & 0x10000000L) != 0L)
            return jjStartNfaWithStates_0(2, 28, 37);
         break;
      case 109:
         if ((active0 & 0x4000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 38, 37);
         break;
      case 110:
         if ((active0 & 0x80000000L) != 0L)
         {
            jjmatchedKind = 31;
            jjmatchedPos = 2;
         }
         else if ((active0 & 0x200000000L) != 0L)
         {
            jjmatchedKind = 33;
            jjmatchedPos = 2;
         }
         else if ((active0 & 0x800000000000L) != 0L)
         {
            jjmatchedKind = 47;
            jjmatchedPos = 2;
         }
         return jjMoveStringLiteralDfa3_0(active0, 0x2a9400000000L);
      case 112:
         if ((active0 & 0x20000000L) != 0L)
            return jjStartNfaWithStates_0(2, 29, 37);
         break;
      case 114:
         if ((active0 & 0x8000000L) != 0L)
         {
            jjmatchedKind = 27;
            jjmatchedPos = 2;
         }
         return jjMoveStringLiteralDfa3_0(active0, 0x4000000L);
      case 115:
         if ((active0 & 0x2000000L) != 0L)
            return jjStartNfaWithStates_0(2, 25, 37);
         else if ((active0 & 0x100000000L) != 0L)
         {
            jjmatchedKind = 32;
            jjmatchedPos = 2;
         }
         return jjMoveStringLiteralDfa3_0(active0, 0x800000000L);
      case 120:
         if ((active0 & 0x1000000000000L) != 0L)
         {
            jjmatchedKind = 48;
            jjmatchedPos = 2;
         }
         return jjMoveStringLiteralDfa3_0(active0, 0x550000000000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private final int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 76:
         return jjMoveStringLiteralDfa4_0(active0, 0x10000000000000L);
      case 86:
         return jjMoveStringLiteralDfa4_0(active0, 0x20000000000000L);
      case 87:
         return jjMoveStringLiteralDfa4_0(active0, 0x8000000000000L);
      case 100:
         if ((active0 & 0x400000000L) != 0L)
            return jjStartNfaWithStates_0(3, 34, 37);
         else if ((active0 & 0x800000000L) != 0L)
            return jjStartNfaWithStates_0(3, 35, 37);
         else if ((active0 & 0x1000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 36, 37);
         break;
      case 110:
         if ((active0 & 0x2000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 37, 37);
         break;
      case 116:
         if ((active0 & 0x4000000L) != 0L)
            return jjStartNfaWithStates_0(3, 26, 37);
         else if ((active0 & 0x8000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 39, 37);
         else if ((active0 & 0x10000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 40, 37);
         break;
      case 120:
         if ((active0 & 0x20000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 41, 37);
         else if ((active0 & 0x40000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 42, 37);
         break;
      case 121:
         if ((active0 & 0x80000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 43, 37);
         else if ((active0 & 0x100000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 44, 37);
         break;
      case 122:
         if ((active0 & 0x200000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 45, 37);
         else if ((active0 & 0x400000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 46, 37);
         break;
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private final int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 69:
         return jjMoveStringLiteralDfa5_0(active0, 0x20000000000000L);
      case 83:
         if ((active0 & 0x8000000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 51, 37);
         else if ((active0 & 0x10000000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 52, 37);
         break;
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
private final int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 76:
         return jjMoveStringLiteralDfa6_0(active0, 0x20000000000000L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
private final int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 83:
         if ((active0 & 0x20000000000000L) != 0L)
            return jjStartNfaWithStates_0(6, 53, 37);
         break;
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
private final void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private final void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private final void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}
private final void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}
private final void jjCheckNAddStates(int start)
{
   jjCheckNAdd(jjnextStates[start]);
   jjCheckNAdd(jjnextStates[start + 1]);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private final int jjMoveNfa_0(int startState, int curPos)
{
//   int[] nextStates;
   int startsAt = 0;
   jjnewStateCnt = 37;
   int i = 1;
   jjstateSet[0] = startState;
//   int j;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 37:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 57)
                        kind = 57;
                     jjCheckNAddTwoStates(11, 12);
                  }
                  else if (curChar == 58)
                     jjCheckNAdd(13);
                  break;
               case 26:
                  if (curChar == 42)
                     jjCheckNAddTwoStates(32, 33);
                  else if (curChar == 47)
                     jjCheckNAddStates(0, 2);
                  break;
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(3, 6);
                  else if (curChar == 47)
                     jjAddStates(7, 8);
                  else if (curChar == 46)
                     jjCheckNAdd(5);
                  if ((0x3fe000000000000L & l) != 0L)
                  {
                     if (kind > 7)
                        kind = 7;
                     jjCheckNAddTwoStates(1, 2);
                  }
                  else if (curChar == 48)
                  {
                     if (kind > 7)
                        kind = 7;
                     jjCheckNAdd(2);
                  }
                  break;
               case 1:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 7)
                     kind = 7;
                  jjCheckNAddTwoStates(1, 2);
                  break;
               case 3:
                  if (curChar != 48)
                     break;
                  if (kind > 7)
                     kind = 7;
                  jjCheckNAdd(2);
                  break;
               case 4:
                  if (curChar == 46)
                     jjCheckNAdd(5);
                  break;
               case 5:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 8)
                     kind = 8;
                  jjCheckNAddStates(9, 11);
                  break;
               case 7:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(8);
                  break;
               case 8:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 8)
                     kind = 8;
                  jjCheckNAddTwoStates(8, 9);
                  break;
               case 11:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 57)
                     kind = 57;
                  jjCheckNAddTwoStates(11, 12);
                  break;
               case 12:
                  if (curChar == 58)
                     jjCheckNAdd(13);
                  break;
               case 13:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 57)
                     kind = 57;
                  jjCheckNAdd(13);
                  break;
               case 14:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(3, 6);
                  break;
               case 15:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(15, 16);
                  break;
               case 16:
                  if (curChar != 46)
                     break;
                  if (kind > 8)
                     kind = 8;
                  jjCheckNAddStates(12, 14);
                  break;
               case 17:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 8)
                     kind = 8;
                  jjCheckNAddStates(12, 14);
                  break;
               case 19:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(20);
                  break;
               case 20:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 8)
                     kind = 8;
                  jjCheckNAddTwoStates(20, 9);
                  break;
               case 21:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(21, 22);
                  break;
               case 23:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(24);
                  break;
               case 24:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 8)
                     kind = 8;
                  jjCheckNAddTwoStates(24, 9);
                  break;
               case 25:
                  if (curChar == 47)
                     jjAddStates(7, 8);
                  break;
               case 27:
                  if ((0xffffffffffffdbffL & l) != 0L)
                     jjCheckNAddStates(0, 2);
                  break;
               case 28:
                  if ((0x2400L & l) != 0L && kind > 5)
                     kind = 5;
                  break;
               case 29:
                  if (curChar == 10 && kind > 5)
                     kind = 5;
                  break;
               case 30:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 29;
                  break;
               case 31:
                  if (curChar == 42)
                     jjCheckNAddTwoStates(32, 33);
                  break;
               case 32:
                  if ((0xfffffbffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(32, 33);
                  break;
               case 33:
                  if (curChar == 42)
                     jjAddStates(15, 16);
                  break;
               case 34:
                  if ((0xffff7fffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(35, 33);
                  break;
               case 35:
                  if ((0xfffffbffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(35, 33);
                  break;
               case 36:
                  if (curChar == 47 && kind > 6)
                     kind = 6;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 37:
               case 11:
                  if ((0x7fffffeaffffffeL & l) == 0L)
                     break;
                  if (kind > 57)
                     kind = 57;
                  jjCheckNAddTwoStates(11, 12);
                  break;
               case 0:
                  if ((0x7fffffeaffffffeL & l) == 0L)
                     break;
                  if (kind > 57)
                     kind = 57;
                  jjCheckNAddTwoStates(11, 12);
                  break;
               case 2:
                  if ((0x100000001000L & l) != 0L && kind > 7)
                     kind = 7;
                  break;
               case 6:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(17, 18);
                  break;
               case 9:
                  if ((0x4000000040L & l) != 0L && kind > 8)
                     kind = 8;
                  break;
               case 18:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(19, 20);
                  break;
               case 22:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(21, 22);
                  break;
               case 27:
                  jjAddStates(0, 2);
                  break;
               case 32:
                  jjCheckNAddTwoStates(32, 33);
                  break;
               case 34:
               case 35:
                  jjCheckNAddTwoStates(35, 33);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 27:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(0, 2);
                  break;
               case 32:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjCheckNAddTwoStates(32, 33);
                  break;
               case 34:
               case 35:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjCheckNAddTwoStates(35, 33);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 37 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   27, 28, 30, 15, 16, 21, 22, 26, 31, 5, 6, 9, 17, 18, 9, 34, 
   36, 7, 8, 19, 20, 23, 24, 
};
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, null, null, "\76", "\74", 
"\75\75", "\74\75", "\76\75", "\41\75", "\174\174", "\46\46", "\53", "\55", "\52", 
"\57", "\45", "\52\52", "\141\142\163", "\163\161\162\164", "\163\161\162", 
"\154\157\147", "\145\170\160", "\154\156", "\163\151\156", "\143\157\163", "\164\141\156", 
"\163\151\156\144", "\143\157\163\144", "\164\141\156\144", "\155\145\141\156", "\163\165\155", 
"\155\151\156\164", "\155\141\170\164", "\155\151\156\170", "\155\141\170\170", 
"\155\151\156\171", "\155\141\170\171", "\155\151\156\172", "\155\141\170\172", "\155\151\156", 
"\155\141\170", "\105", "\120\111", "\116\122\117\127\123", "\116\103\117\114\123", 
"\116\114\105\126\105\114\123", "\73", "\50", "\51", null, null, null, };
public static final String[] lexStateNames = {
   "DEFAULT", 
};
static final long[] jjtoToken = {
   0x3fffffffffff981L, 
};
static final long[] jjtoSkip = {
   0x7eL, 
};
protected SimpleCharStream input_stream;
private final int[] jjrounds = new int[37];
private final int[] jjstateSet = new int[74];
protected char curChar;
public ParserTokenManager(SimpleCharStream stream){
   if (SimpleCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}
public ParserTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}
public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private final void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 37; i-- > 0;)
      jjrounds[i] = 0x80000000;
}
public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}
public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
{
   Token t = Token.newToken(jjmatchedKind);
   t.kind = jjmatchedKind;
   String im = jjstrLiteralImages[jjmatchedKind];
   t.image = (im == null) ? input_stream.GetImage() : im;
   t.beginLine = input_stream.getBeginLine();
   t.beginColumn = input_stream.getBeginColumn();
   t.endLine = input_stream.getEndLine();
   t.endColumn = input_stream.getEndColumn();
   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

public Token getNextToken() 
{
//  int kind;
//  Token specialToken = null;
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {   
   try   
   {     
      curChar = input_stream.BeginToken();
   }     
   catch(java.io.IOException e)
   {        
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

}
