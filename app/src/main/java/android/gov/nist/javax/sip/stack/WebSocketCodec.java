package android.gov.nist.javax.sip.stack;

import android.gov.nist.core.CommonLogger;
import android.gov.nist.core.Separators;
import android.gov.nist.core.StackLogger;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/* loaded from: classes2.dex */
public class WebSocketCodec {
    private static final byte OPCODE_BINARY = 2;
    private static final byte OPCODE_CLOSE = 8;
    private static final byte OPCODE_CONT = 0;
    private static final byte OPCODE_PING = 9;
    private static final byte OPCODE_PONG = 10;
    private final boolean allowExtensions;
    private boolean closeOpcodeReceived;
    private int fragmentedFramesCount;
    private boolean frameFinalFlag;
    private int frameOpcode;
    private long framePayloadLength;
    private int frameRsv;
    private final boolean maskedPayload;
    private int readIndex;
    private static StackLogger logger = CommonLogger.getLogger(WebSocketCodec.class);
    private static final byte OPCODE_TEXT = 1;
    private static final byte[] trivialMask = {OPCODE_TEXT, OPCODE_TEXT, OPCODE_TEXT, OPCODE_TEXT};
    private byte[] maskingKey = new byte[4];
    private int payloadStartIndex = -1;
    private byte[] decodeBuffer = new byte[2048];
    private int writeIndex = 0;
    private long totalPacketLength = -1;

    public WebSocketCodec(boolean z10, boolean z11) {
        this.maskedPayload = z10;
        this.allowExtensions = z11;
    }

    public static void applyMask(byte[] bArr, int i10, int i11, byte[] bArr2) {
        for (int i12 = 0; i12 < i11 - i10; i12++) {
            int i13 = i10 + i12;
            bArr[i13] = (byte) (bArr[i13] ^ bArr2[i12 % 4]);
        }
    }

    public static byte[] encode(byte[] bArr, int i10, boolean z10, boolean z11) {
        return encode(bArr, i10, z10, z11, OPCODE_TEXT);
    }

    private void protocolChecks() {
        int i10;
        int i11 = this.frameOpcode;
        if (i11 > 7) {
            if (!this.frameFinalFlag) {
                protocolViolation("fragmented control frame");
            }
            int i12 = this.frameOpcode;
            if (i12 != 8 && i12 != 9 && i12 != 10) {
                protocolViolation("control frame using reserved opcode " + this.frameOpcode);
                return;
            }
            return;
        }
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            protocolViolation("data frame using reserved opcode " + this.frameOpcode);
        }
        if (this.fragmentedFramesCount == 0 && this.frameOpcode == 0) {
            protocolViolation("received continuation data frame outside fragmented message");
        }
        if (this.fragmentedFramesCount != 0 && (i10 = this.frameOpcode) != 0 && i10 != 9) {
            protocolViolation("received non-continuation data frame while inside fragmented message");
        }
    }

    private void protocolViolation(String str) {
        throw new RuntimeException(str);
    }

    private byte readNextByte() {
        int i10 = this.readIndex;
        if (i10 < this.writeIndex) {
            byte[] bArr = this.decodeBuffer;
            this.readIndex = i10 + 1;
            return bArr[i10];
        }
        throw new IllegalStateException();
    }

    private void unmask(byte[] bArr, int i10, int i11) {
        applyMask(bArr, i10, i11, this.maskingKey);
    }

    public byte[] decode(InputStream inputStream) {
        boolean z10;
        boolean z11;
        int i10;
        long j6;
        do {
            int length = this.decodeBuffer.length - this.writeIndex;
            int available = inputStream.available();
            if (available > length - 1) {
                int max = Math.max(this.decodeBuffer.length * 2, available * 4);
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("Increasing buffer size from " + this.decodeBuffer.length + " avail " + available + " newSize " + max);
                }
                byte[] bArr = new byte[max];
                System.arraycopy(this.decodeBuffer, 0, bArr, 0, this.writeIndex);
                this.decodeBuffer = bArr;
            }
            int read = inputStream.read(this.decodeBuffer, this.writeIndex, length);
            if (read < 0) {
                read = 0;
            }
            this.writeIndex += read;
        } while (inputStream.available() > 0);
        this.readIndex = 0;
        if (this.writeIndex < 4) {
            if (logger.isLoggingEnabled(32)) {
                logger.logDebug("Abort decode. Write index is at " + this.writeIndex);
            }
            return null;
        }
        byte readNextByte = readNextByte();
        int i11 = 1;
        if ((readNextByte & 128) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.frameFinalFlag = z10;
        this.frameRsv = (readNextByte & 112) >> 4;
        this.frameOpcode = readNextByte & 15;
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("Decoding WebSocket Frame opCode=" + this.frameOpcode);
        }
        if (this.frameOpcode == 8) {
            this.closeOpcodeReceived = true;
        }
        byte readNextByte2 = readNextByte();
        if ((readNextByte2 & 128) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i12 = readNextByte2 & Byte.MAX_VALUE;
        if (this.frameRsv != 0 && !this.allowExtensions) {
            protocolViolation("RSV != 0 and no extension negotiated, RSV:" + this.frameRsv);
            return null;
        } else if (this.maskedPayload && !z11) {
            protocolViolation("unmasked client to server frame");
            return null;
        } else {
            protocolChecks();
            try {
                if (i12 == 126) {
                    this.framePayloadLength = ((readNextByte() & 255) << 8) | (readNextByte() & 255);
                } else if (i12 == 127) {
                    long j10 = 0;
                    for (int i13 = 0; i13 < 8; i13++) {
                        j10 |= (readNextByte() & 255) << ((7 - i13) * 8);
                    }
                    this.framePayloadLength = j10;
                    if (j10 < 65536) {
                        protocolViolation("invalid data frame length (not using minimal length encoding): " + this.framePayloadLength);
                        return null;
                    }
                } else {
                    this.framePayloadLength = i12;
                }
                if (this.framePayloadLength < 0) {
                    protocolViolation("Negative payload size: " + this.framePayloadLength);
                }
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("Decoding WebSocket Frame length=" + this.framePayloadLength);
                }
                if (z11) {
                    for (int i14 = 0; i14 < 4; i14++) {
                        this.maskingKey[i14] = readNextByte();
                    }
                }
                int i15 = this.readIndex;
                this.payloadStartIndex = i15;
                long j11 = this.framePayloadLength;
                long j12 = i15 + j11;
                this.totalPacketLength = j12;
                if (this.writeIndex < j12) {
                    if (logger.isLoggingEnabled(32)) {
                        logger.logDebug("Abort decode. Write index is at " + this.writeIndex + " and totalPacketLength is " + this.totalPacketLength);
                    }
                    return null;
                }
                if (z11) {
                    unmask(this.decodeBuffer, i15, (int) (i15 + j11));
                }
                long j13 = this.framePayloadLength;
                byte[] bArr2 = new byte[(int) j13];
                System.arraycopy(this.decodeBuffer, this.payloadStartIndex, bArr2, 0, (int) j13);
                while (true) {
                    i10 = this.writeIndex;
                    j6 = this.totalPacketLength;
                    if (i11 >= i10 - j6) {
                        break;
                    }
                    byte[] bArr3 = this.decodeBuffer;
                    bArr3[i11] = bArr3[((int) j6) + i11];
                    i11++;
                }
                this.writeIndex = (int) (i10 - j6);
                if (logger.isLoggingEnabled(32)) {
                    logger.logDebug("writeIndex = " + this.writeIndex + Separators.SP + this.totalPacketLength);
                }
                return bArr2;
            } catch (IllegalStateException unused) {
                return null;
            }
        }
    }

    public boolean isCloseOpcodeReceived() {
        return this.closeOpcodeReceived;
    }

    public static byte[] encode(byte[] bArr, int i10, boolean z10, boolean z11, byte b10) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        long length = bArr.length;
        if (logger.isLoggingEnabled(32)) {
            logger.logDebug("Encoding WebSocket Frame opCode=" + ((int) b10) + " length=" + length);
        }
        int i11 = ((i10 % 8) << 4) | (z10 ? 128 : 0) | (b10 % 128);
        if (length <= 125) {
            byteArrayOutputStream.write(i11);
            int i12 = (byte) length;
            if (z11) {
                i12 |= 128;
            }
            byteArrayOutputStream.write((byte) i12);
        } else if (length <= 65535) {
            byteArrayOutputStream.write(i11);
            byteArrayOutputStream.write(z11 ? 254 : 126);
            byteArrayOutputStream.write((byte) (length >>> 8));
            byteArrayOutputStream.write((byte) length);
        } else {
            byteArrayOutputStream.write(i11);
            byteArrayOutputStream.write(z11 ? 255 : 127);
            for (int i13 = 0; i13 < 8; i13++) {
                byteArrayOutputStream.write((byte) (length >>> ((7 - i13) * 8)));
            }
        }
        if (z11) {
            byte[] bArr2 = trivialMask;
            byteArrayOutputStream.write(bArr2);
            applyMask(bArr, 0, bArr.length, bArr2);
        }
        byteArrayOutputStream.write(bArr);
        return byteArrayOutputStream.toByteArray();
    }
}
