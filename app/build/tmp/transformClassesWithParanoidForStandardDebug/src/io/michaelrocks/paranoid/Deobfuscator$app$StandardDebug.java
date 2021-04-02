package io.michaelrocks.paranoid;

public class Deobfuscator$app$StandardDebug {
  private static final String[] charChunks = new String[] {
      "\u0057\u0069\u004c\u005a\u0061\u0054\u0050\u003c\u2026\u0042\u0020\u006e\u0039\u005b\u0033\u0075\u0047\u0044\u0074\u0058\u004d\u006f\u0062\u0049\u0070\u006c\n\u0043\u002f\u007b\u006a\u004a\u0052\u0029\u004b\u0035\u005d\u0066\u0025\u002e\u0056\u0041\u007a\u0079\u0063\u004f\u003b\u005f\u0051\"\u0071\u0030\u0048\u0037\u0036\u0024\u0077\u0068\u002d\u003e\u0065\u0067\u0072\u0028\u0034\u003a\u002b\u006b\u0078\u0031\u0038\u0076\u006d\u0053\u0064\u0045\u004e\u0032\u0059\u0073\u0055\u003f\u0046\u007d"
  };
  private static final String[] indexChunks = new String[] {
      "\u0018\u003e\u0015\u004a\u000f\u002c\u0012\u004f\u0018\u000f\u003e\u002c\u0039\u0004\u004f\u003c\u0028\u003c\u003e\u0001\u0025\u0001\u002c\u0004\u0012\u0001\u0015\u000b\n\u004a\u0015\u000b\u003c\u0041\n\u0026\u004f\u0001\u0012\u003c\u002c\u0015\u0048\u0048\u003c\u003e\u002c\u003c\u002f\u0018\u000f\u003e\u002c\u0039\u0004\u004f\u003c\u0018\u000f\u003e\u002c\u0039\u0004\u004f\u003c\u003c\u002c\u0039\u003c\u002c\u0043\u0015\u000f\u0012\u0007\u004f\u003c\u0012\u003a\u0051\u003b\u002c\u0015\u0048\u0018\u0019\u003c\u0012\u003c\u001b\u0004\u0019\u0019\u0016\u0004\u002c\u0043\u001b\u0039\u003c\u002c\u0043\u0015\u000f\u0012\'\u0025\u0015\u003e\u0029\u002c\u0012\u0001\u0047\u0001\u0012\u002b\u003f\u0004\u002c\u0012\u0008\u004f\u003c\u002c\u000f\u003e\u003c\u0050\u0012\u0001\u0019\u004f\'\u003d\u003c\u0012\u0009\u0001\u0019\u0019\u0001\u000b\u003d\u003f\u0021\u0021\u002c\u0039\u003c\u002c\u0043\u0015\u000f\u0012\u002c\u0039\u003c\u002c\u0043\u0015\u000f\u0012\u002c\u0039\u003c\u002c\u0043\u0015\u000f\u0012\u002c\u0039\u003c\u002c\u0043\u0015\u000f\u0012\'\u0048\u0004\u0043\u003c\u0017\u000b\u0047\u003c\u000b\u0012\u0015\u003e\u002b\u003f\u0021\u0001\u000b\u0047\u003c\u000b\u0012\u0015\u003e\u002b\u0001\u000b\u0004\u0018\u0018\u002c\u0039\u003c\u002c\u0043\u0015\u000f\u0012\u0006\u000f\u003e\u002c\u0039\u0004\u004f\u003c\n\u002c\u0015\u0048\u0018\u0019\u003c\u0012\u003c\u0041\n\u0026\u004f\u0018\u0004\u002c\u0043\u0004\u003d\u003c\u004c\u0004\u0048\u003c\u0018\u003e\u0015\u004a\u000f\u002c\u0012\u0017\u004a\u0012\u0015\u0043\u003c\u000b\u002c\u0039\u003c\u002c\u0043\u0015\u000f\u0012\u0004\u002c\u0012\u0001\u0047\u0001\u0012\u002b\u001b\u0015\u000b\u0012\u003c\u0044\u0012\u004f\u003c\u002c\u000f\u003e\u003c\u0050\u0012\u0001\u0019\u004f\u0001\u004f\u0002\u0015\u0004\u004a\u0001\u000b\u003d\u0018\u0045\u0007\u0001\u000b\u0001\u0012\u003b\u0007\u0001\u000b\u0001\u0012\u003b\u003f\u0002\u0004\u000b\u004a\u003e\u0015\u0001\u004a\u001c\u002c\u0015\u000b\u0012\u003c\u000b\u0012\u001c\u001b\u0015\u000b\u0012\u003c\u0044\u0012\u002e\u0021\u0028\u0014\u0017\u0017\u0009\u0017\u001e\u0029\u004c\u0009\u003d\u0043\u0032\u0039\u0043\u0001\u0010\u000c\u0038\u0033\u0009\u0029\u0030\u004b\u0052\u0029\u0029\u002d\u001b\u0029\u0030\u0046\u0029\u0014\u0017\u0017\u0009\u001b\u003d\"\u001b\u0029\u0030\u004b\u0029\u001e\u0004\u0044\u001c\u000c\u0017\u0019\u0028\u0019\u004d\u0005\u000c\u0046\u0036\u0017\u000e\u0035\u0003\u0036\u0048\u001e\u0002\u0043\u0038\"\u002b\u0038\u002b\u002b\u0033\u0017\u0017\u000f\u0028\u004c\u003c\u001e\u0052\u0046\u0016\u0002\u003c\u0005\u004c\u0047\u0042\u0038\u002c\u0011\u0018\u0034\u0000\u0023\u0017\u0023\u0002\u0011\u002c\"\u0010\u0035\u002b\u002b\u0047\u0050\u0046\u0044\u0048\u0005\u0012\u0039\u003d\u0019\u0028\u0004\u000c\u0039\u0014\"\u0013\u0049\u001b\u001e\u000f\u000e\u002a\u002d\u003d\u0025\u000b\u0039\u0010\u000f\u003e\u001e\u0040\u0039\u001b\u000c\u0006\"\u003c\u0043\u0046\u000b\u003d\u0020\u001c\u0045\u0012\u0052\u004e\"\u0029\u0042\u0044\u0015\u0052\u0039\u000f\u0046\u001b\u0014\u0028\u0033\u0044\u0010\u004a\u0046\u0003\u0044\u001f\u004e\u0032\u000f\u0033\u0003\u001c\u0009\u0042\u0042\u0044\u0003\u0035\u0004\u002d\u0049\u0010\u003d\u0029\u0042\u004b\u004a\u0028\u0005\u0013\u0049\u0006\u001c\u0028\u0048\"\u0023\u0012\u003d\u0045\u002b\u0014\u0002\u0033\u001b\u0015\u000b\"\u004b\u0036\u004b\u0049\u0028\u004e\u0047\u0012\u0011\u0036\u0047\u003c\u0052\u0033\u000c\u0003\u0044\u004f\u0016\u0034\u0016\u004a\u000f\u0011\u004f\u002b\u0001\u0050\u0030\u0050\u0043\u000c\u0042\u0047\u001b\u0034\u0035\u0039\u0003\u003c\u0017\u002a\u0040\u0042\u004d\u0018\u003d\u004a\u003e\u001f\u002b\u0029\u0004\u0032\u0046\u0010\u0005\u0016\u0005\u002c\u0025\u000f\u002d\u004c\u0042\u003e\u001c\u0016\u0023\u0020\u0023\u0003\u004d\u004d\u0043\u0044\u0010\u0002\u0052\u004c\u004a\u0045\u004b\u0025\u0029\u004c\u0045\u004d\u0011\u0035\u000f\u004c\u0013\u000c\u0030\u0050\u001f\u000b\u0000\u004c\u002b\u0040\u004b\u0016\u0012\u000e\u0030\u0040\u0002\u0016\u0036\"\u0034\u001c\u0046\u004c\u0009\u0000\u001c\u002c\u0032\"\u0046\u0001\u004d\u004d\u004a\u001c\u001c\u0050\u003d\u0052\u0034\u001b\u0014\u001c\u0044\u002d\u0004\u0048\u0020\u0032\u002b\u0032\u0044\u0006\u003c\u004c\u0052\u0036\u0043\u004d\u0005\u003c\u0046\u003d\u0034\u001e\u0009\u0012\u0043\u004a\u0014\u000e\u0043\u000e\u000e\u0038\u0017\u0011\u0029\u0030\u0029\u0009\u003c\u003e\u003e\u0015\u003e\r\u0001\u004f\u0049\u0004\u0025\u003c\u004b\u0044\u0012\u003c\u000b\u004a\u003c\u004a\u0024\r\u004a\u0015\u004c\u0015\u0012\u0029\u0019\u0019\u0015\u0038\u0024\n\u003c\u003e\u003e\u0015\u003e\u003c\u003e\u003e\u0015\u003e\r\u0001\u004f\u0049\u0004\u0025\u003c\u004b\u0044\u0012\u003c\u000b\u004a\u003c\u004a\u0024\r\u004a\u0015\u004c\u0015\u0012\u0029\u0019\u0019\u0015\u0038\u0024\n\u0037\u003e\u003c\u002c\u003c\u0001\u0047\u003c\u003e\u0037\u003e\u003c\u002c\u003c\u0001\u0047\u003c\u003e\u0014\u0017\u0017\u0009\u0017\u001e\u0029\u004c\u0009\u003d\u0043\u0032\u0039\u0043\u0001\u0010\u000c\u0038\u0033\u0009\u0029\u0030\u004b\u0052\u0029\u0029\u002d\u001b\u0029\u0030\u0046\u0029\u0014\u0017\u0017\u0009\u001b\u003d\"\u001b\u0029\u0030\u004b\u0029\u001e\u0004\u0044\u001c\u000c\u0017\u0019\u0028\u0019\u004d\u0005\u000c\u0046\u0036\u0017\u000e\u0035\u0003\u0036\u0048\u001e\u0002\u0043\u0038\"\u002b\u0038\u002b\u002b\u0033\u0017\u0017\u000f\u0028\u004c\u003c\u001e\u0052\u0046\u0016\u0002\u003c\u0005\u004c\u0047\u0042\u0038\u002c\u0011\u0018\u0034\u0000\u0023\u0017\u0023\u0002\u0011\u002c\"\u0010\u0035\u002b\u002b\u0047\u0050\u0046\u0044\u0048\u0005\u0012\u0039\u003d\u0019\u0028\u0004\u000c\u0039\u0014\"\u0013\u0049\u001b\u001e\u000f\u000e\u002a\u002d\u003d\u0025\u000b\u0039\u0010\u000f\u003e\u001e\u0040\u0039\u001b\u000c\u0006\"\u003c\u0043\u0046\u000b\u003d\u0020\u001c\u0045\u0012\u0052\u004e\"\u0029\u0042\u0044\u0015\u0052\u0039\u000f\u0046\u001b\u0014\u0028\u0033\u0044\u0010\u004a\u0046\u0003\u0044\u001f\u004e\u0032\u000f\u0033\u0003\u001c\u0009\u0042\u0042\u0044\u0003\u0035\u0004\u002d\u0049\u0010\u003d\u0029\u0042\u004b\u004a\u0028\u0005\u0013\u0049\u0006\u001c\u0028\u0048\"\u0023\u0012\u003d\u0045\u002b\u0014\u0002\u0033\u001b\u0015\u000b\"\u004b\u0036\u004b\u0049\u0028\u004e\u0047\u0012\u0011\u0036\u0047\u003c\u0052\u0033\u000c\u0003\u0044\u004f\u0016\u0034\u0016\u004a\u000f\u0011\u004f\u002b\u0001\u0050\u0030\u0050\u0043\u000c\u0042\u0047\u001b\u0034\u0035\u0039\u0003\u003c\u0017\u002a\u0040\u0042\u004d\u0018\u003d\u004a\u003e\u001f\u002b\u0029\u0004\u0032\u0046\u0010\u0005\u0016\u0005\u002c\u0025\u000f\u002d\u004c\u0042\u003e\u001c\u0016\u0023\u0020\u0023\u0003\u004d\u004d\u0043\u0044\u0010\u0002\u0052\u004c\u004a\u0045\u004b\u0025\u0029\u004c\u0045\u004d\u0011\u0035\u000f\u004c\u0013\u000c\u0030\u0050\u001f\u000b\u0000\u004c\u002b\u0040\u004b\u0016\u0012\u000e\u0030\u0040\u0002\u0016\u0036\"\u0034\u001c\u0046\u004c\u0009\u0000\u001c\u002c\u0032\"\u0046\u0001\u004d\u004d\u004a\u001c\u001c\u0050\u003d\u0052\u0034\u001b\u0014\u001c\u0044\u002d\u0004\u0048\u0020\u0032\u002b\u0032\u0044\u0006\u003c\u004c\u0052\u0036\u0043\u004d\u0005\u003c\u0046\u003d\u0034\u001e\u0009\u0012\u0043\u004a\u0014\u000e\u0043\u000e\u000e\u0038\u0017\u0011\u0029\u0030\u0029\u0009\u0009\u000f\u0001\u0019\u004a\u001b\u0015\u000b\u0025\u0001\u003d\'\u004b\u0013\u0005\u004b\u004c\u0011\u004b\u0011\u002f\u0028\u0029\u0002\u0017\u0011\u0029\u0005\u0017\u002d\u004c\u003c\u0048\u0001\u0012\u0012\u003c\u003e\u001c\u001c\u001c\u001c\u000b\u000f\u0019\u0019\n\u002c\u0004\u000b\u000b\u0015\u0012\n\u0016\u003c\n\u002c\u0004\u004f\u0012\n\u0012\u0015\n\u000b\u0015\u000b\u003a\u000b\u000f\u0019\u0019\n\u0012\u002b\u0018\u003c\n\u002c\u0015\u0048\'\u004f\u003c\u002c\u000f\u003e\u003c\u0018\u003e\u003c\u0025\u003c\u003e\u003c\u000b\u002c\u003c\u004f\'\u0049\u003c\u002c\u000f\u003e\u003c\u0006\u003e\u003c\u0025\u003c\u003e\u003c\u000b\u002c\u003c\u004f\u0004\u0019\u0019\u0015\u0038\u004a\u0015\u004c\u0015\u0012\u0029\u0019\u0019\u0015\u0038\u0015\u000b\u004b\u003e\u003e\u0015\u003e\r\u0018\u0004\u0024\n\u0001\u004f\u0049\u0004\u0025\u003c\u004b\u0044\u0012\u003c\u000b\u004a\u003c\u004a\u000b\u000f\u0019\u0019\n\u002c\u0004\u000b\u000b\u0015\u0012\n\u0016\u003c\n\u002c\u0004\u004f\u0012\n\u0012\u0015\n\u000b\u0015\u000b\u003a\u000b\u000f\u0019\u0019\n\u0012\u002b\u0018\u003c\n\u0043\u0015\u0012\u0019\u0001\u000b\'\u0009\u0015\u0015\u0019\u003c\u0004\u000b\u0018\u000f\u003e\u002c\u0039\u0004\u004f\u003c\u001e\u004f\u0015\u000b\u002d\u0016\u001e\u003c\u002c\u0012\u0001\u004f\u0006\u000f\u003e\u002c\u0039\u0004\u004f\u003c\u004a\u0015\u003e\u004a\u003c\u003e\u0017\u004a\u0001\u004f\u0006\u000f\u003e\u002c\u0039\u0004\u004f\u003c\u004a\u0015\u003e\u004a\u003c\u003e\u0017\u004a\u0018\u000f\u003e\u002c\u0039\u0004\u004f\u003c\u000b\u0004\u0048\u003c\u0004\u000b\u004a\u003e\u0015\u0001\u004a\'\u0015\u004f\'\u0049\u002b\u004f\u0012\u003c\u0048\u0006\u003e\u0015\u0018\u003c\u003e\u0012\u0001\u003c\u004f\u001b\u0019\u0004\u004f\u004f\'\u0025\u0015\u003e\u004c\u0004\u0048\u003c\u003f\u0031\u0004\u000b\u004a\u003e\u0015\u0001\u004a\'\u0015\u004f\'\u0049\u002b\u004f\u0012\u003c\u0048\u0006\u003e\u0015\u0018\u003c\u003e\u0012\u0001\u003c\u004f\u0031\u0021\u003d\u003c\u0012\u000b\u000f\u0019\u0019\n\u002c\u0004\u000b\u000b\u0015\u0012\n\u0016\u003c\n\u002c\u0004\u004f\u0012\n\u0012\u0015\n\u000b\u0015\u000b\u003a\u000b\u000f\u0019\u0019\n\u0012\u002b\u0018\u003c\n\u0043\u0015\u0012\u0019\u0001\u000b\'\u0049\u0012\u003e\u0001\u000b\u003d\u0018\u0004\u002c\u0043\u0004\u003d\u003c\u0017\u000b\u0025\u0015\'\u004f\u0001\u003d\u000b\u0004\u0012\u000f\u003e\u003c\u004f\u0049\u0034\u0029\r\u002c\u000f\u003e\u003e\u003c\u000b\u0012\u0049\u0001\u003d\u000b\u0004\u0012\u000f\u003e\u003c\u0024\n\u0026\u004f\u003e\u003c\u0032\u000f\u003c\u004f\u0012\u0006\u0004\u0012\u0039\u0018\u0004\u002b\u0019\u0015\u0004\u004a\u002d\u0016\u004f\u003c\u003e\u0047\u0004\u0016\u0019\u003c\'\u002c\u003e\u003c\u0004\u0012\u003c\n\u001d\n\u003c\u0048\u0001\u0012\u0008\u0012\u0030\u000f\u003c\u000f\u003c\u003f\u003e\u003c\u0032\u000f\u003c\u004f\u0012\u0021\u001a\n\n\n\n\n\n\n\n\u0053\u002c\u0015\u000b\u0012\u003c\u0044\u0012\u002c\u0015\u0048\'\u0004\u003e\u003d\u0015\u000b\u0004\u000f\u0012\'\u004f\u001e\u003e\u0048\u0039\u0012\u0012\u0018\u004f\u0041\u001c\u001c\u0018\u0015\u004f\u0012\u0016\'\u0001\u000b\u001c\u0001\u0001\u0015\u0019\u004f\u0030\u0029\u004a\u0018\u003e\u0015\u002f\u0004\u0018\u0018\u002c\u0039\u003c\u002c\u0043\u001c\u0016\u000f\u002b"
  };
  private static final String[] locationChunks = new String[] {
      "\u0000\u0000\u0008\u0000\u0010\u0000\u0025\u0000\'\u0000\u0039\u0000\u0041\u0000\u0042\u0000\u004a\u0000\u0051\u0000\u0061\u0000\u0093\u0000\u009b\u0000\u00a3\u0000\u00ab\u0000\u00c3\u0000\u00cc\u0000\u00d1\u0000\u00d9\u0000\u00ee\u0000\u00f9\u0000\u0102\u0000\u0107\u0000\u010f\u0000\u011e\u0000\u0129\u0000\u0132\u0000\u0134\u0000\u013a\u0000\u015c\u0000\u02e4\u0000\u02e9\u0000\u0306\u0000\u030b\u0000\u0310\u0000\u032d\u0000\u0336\u0000\u033f\u0000\u04c7\u0000\u04e6\u0000\u04ed\u0000\u04ee\u0000\u04ef\u0000\u04f0\u0000\u04f1\u0000\u053d\u0000\u0542\u0000\u054c\u0000\u0553\u0000\u0566\u0000\u0599\u0000\u05a1\u0000\u05ab\u0000\u05b6\u0000\u05bd\u0000\u05c8\u0000\u05cf\u0000\u05d7\u0000\u05db\u0000\u05f6\u0000\u0622\u0000\u0625\u0000\u0657\u0000\u066d\u0000\u0670\u0000\u0685\u0000\u0690\u0000\u0697\u0000\u06c9\u0000\u06d0\u0000\u06e1\u0000\u06fa\u0000\u0701\u0000\u070a\u0000"
  };

  public static String getString(final int id) {
    final int location1ChunkIndex = id / 4096;
    final int location1Index = id % 4096;
    final int location2ChunkIndex = (id + 1) / 4096;
    final int location2Index = (id + 1) % 4096;
    final String locations1 = locationChunks[location1ChunkIndex];
    final String locations2 = locationChunks[location2ChunkIndex];
    final int offset1Low = locations1.charAt(2 * location1Index) & 0xffff;
    final int offset1High = locations1.charAt(2 * location1Index + 1) & 0xffff;
    final int offset1 = (offset1High << 16) | offset1Low;
    final int offset2Low = locations2.charAt(2 * location2Index);
    final int offset2High = locations2.charAt(2 * location2Index + 1);
    final int offset2 = (offset2High << 16) | offset2Low;
    final int length = offset2 - offset1;
    final char[] stringChars = new char[length];
    for (int i = 0; i < length; ++i) {
      final int offset = offset1 + i;
      final int indexChunkIndex = offset / 8192;
      final int indexIndex = offset % 8192;
      final String indexes = indexChunks[indexChunkIndex];
      final int index = indexes.charAt(indexIndex) & 0xffff;
      final int charChunkIndex = index / 8192;
      final int charIndex = index % 8192;
      final String chars = charChunks[charChunkIndex];
      stringChars[i] = chars.charAt(charIndex);
    }
    return new String(stringChars);
  }
}
