package android.gov.nist.javax.sip.stack;

import android.gov.nist.core.a;
import com.google.android.gms.internal.play_billing.N;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import r.f;

/* loaded from: classes2.dex */
public class Base64 {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int DECODE = 0;
    public static final int DONT_GUNZIP = 4;
    public static final int DO_BREAK_LINES = 8;
    public static final int ENCODE = 1;
    public static final int GZIP = 2;
    private static final int MAX_LINE_LENGTH = 76;
    public static final int NO_OPTIONS = 0;
    public static final int ORDERED = 32;
    private static final String PREFERRED_ENCODING = "US-ASCII";
    public static final int URL_SAFE = 16;
    private static final byte[] _STANDARD_ALPHABET = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    private static final byte WHITE_SPACE_ENC = -5;
    private static final byte EQUALS_SIGN = 61;
    private static final byte EQUALS_SIGN_ENC = -1;
    private static final byte NEW_LINE = 10;
    private static final byte[] _STANDARD_DECODABET = {-9, -9, -9, -9, -9, -9, -9, -9, -9, WHITE_SPACE_ENC, WHITE_SPACE_ENC, -9, -9, WHITE_SPACE_ENC, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, WHITE_SPACE_ENC, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, EQUALS_SIGN, -9, -9, -9, EQUALS_SIGN_ENC, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, NEW_LINE, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, -9, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};
    private static final byte[] _URL_SAFE_ALPHABET = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
    private static final byte[] _URL_SAFE_DECODABET = {-9, -9, -9, -9, -9, -9, -9, -9, -9, WHITE_SPACE_ENC, WHITE_SPACE_ENC, -9, -9, WHITE_SPACE_ENC, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, WHITE_SPACE_ENC, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, 52, 53, 54, 55, 56, 57, 58, 59, 60, EQUALS_SIGN, -9, -9, -9, EQUALS_SIGN_ENC, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, NEW_LINE, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, 63, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};
    private static final byte[] _ORDERED_ALPHABET = {45, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122};
    private static final byte[] _ORDERED_DECODABET = {-9, -9, -9, -9, -9, -9, -9, -9, -9, WHITE_SPACE_ENC, WHITE_SPACE_ENC, -9, -9, WHITE_SPACE_ENC, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, WHITE_SPACE_ENC, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 0, -9, -9, 1, 2, 3, 4, 5, 6, 7, 8, 9, NEW_LINE, -9, -9, -9, EQUALS_SIGN_ENC, -9, -9, -9, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, -9, -9, -9, -9, 37, -9, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, EQUALS_SIGN, 62, 63, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9};

    /* loaded from: classes2.dex */
    public static class InputStream extends FilterInputStream {
        private boolean breakLines;
        private byte[] buffer;
        private int bufferLength;
        private byte[] decodabet;
        private boolean encode;
        private int lineLength;
        private int numSigBytes;
        private int options;
        private int position;

        public InputStream(java.io.InputStream inputStream) {
            this(inputStream, 0);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() {
            int read;
            if (this.position < 0) {
                if (this.encode) {
                    byte[] bArr = new byte[3];
                    int i10 = 0;
                    for (int i11 = 0; i11 < 3; i11++) {
                        int read2 = ((FilterInputStream) this).in.read();
                        if (read2 < 0) {
                            break;
                        }
                        bArr[i11] = (byte) read2;
                        i10++;
                    }
                    if (i10 <= 0) {
                        return -1;
                    }
                    Base64.encode3to4(bArr, 0, i10, this.buffer, 0, this.options);
                    this.position = 0;
                    this.numSigBytes = 4;
                } else {
                    byte[] bArr2 = new byte[4];
                    int i12 = 0;
                    while (i12 < 4) {
                        do {
                            read = ((FilterInputStream) this).in.read();
                            if (read < 0) {
                                break;
                            }
                        } while (this.decodabet[read & 127] <= -5);
                        if (read < 0) {
                            break;
                        }
                        bArr2[i12] = (byte) read;
                        i12++;
                    }
                    if (i12 != 4) {
                        if (i12 != 0) {
                            throw new IOException("Improperly padded Base64 input.");
                        }
                        return -1;
                    }
                    this.numSigBytes = Base64.decode4to3(bArr2, 0, this.buffer, 0, this.options);
                    this.position = 0;
                }
            }
            int i13 = this.position;
            if (i13 >= 0) {
                if (i13 >= this.numSigBytes) {
                    return -1;
                }
                if (this.encode && this.breakLines && this.lineLength >= Base64.MAX_LINE_LENGTH) {
                    this.lineLength = 0;
                    return 10;
                }
                this.lineLength++;
                byte[] bArr3 = this.buffer;
                int i14 = i13 + 1;
                this.position = i14;
                byte b10 = bArr3[i13];
                if (i14 >= this.bufferLength) {
                    this.position = -1;
                }
                return b10 & Base64.EQUALS_SIGN_ENC;
            }
            throw new IOException("Error in Base64 code reading stream.");
        }

        public InputStream(java.io.InputStream inputStream, int i10) {
            super(inputStream);
            this.options = i10;
            boolean z10 = true;
            this.breakLines = (i10 & 8) > 0;
            z10 = (i10 & 1) <= 0 ? false : z10;
            this.encode = z10;
            int i11 = z10 ? 4 : 3;
            this.bufferLength = i11;
            this.buffer = new byte[i11];
            this.position = -1;
            this.lineLength = 0;
            this.decodabet = Base64.getDecodabet(i10);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) {
            int i12 = 0;
            while (true) {
                if (i12 >= i11) {
                    break;
                }
                int read = read();
                if (read >= 0) {
                    bArr[i10 + i12] = (byte) read;
                    i12++;
                } else if (i12 == 0) {
                    return -1;
                }
            }
            return i12;
        }
    }

    /* loaded from: classes.dex */
    public static class OutputStream extends FilterOutputStream {

        /* renamed from: b4  reason: collision with root package name */
        private byte[] f24322b4;
        private boolean breakLines;
        private byte[] buffer;
        private int bufferLength;
        private byte[] decodabet;
        private boolean encode;
        private int lineLength;
        private int options;
        private int position;
        private boolean suspendEncoding;

        public OutputStream(java.io.OutputStream outputStream) {
            this(outputStream, 1);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            flushBase64();
            super.close();
            this.buffer = null;
            ((FilterOutputStream) this).out = null;
        }

        public void flushBase64() {
            int i10 = this.position;
            if (i10 > 0) {
                if (this.encode) {
                    ((FilterOutputStream) this).out.write(Base64.encode3to4(this.f24322b4, this.buffer, i10, this.options));
                    this.position = 0;
                    return;
                }
                throw new IOException("Base64 input not properly padded.");
            }
        }

        public void resumeEncoding() {
            this.suspendEncoding = false;
        }

        public void suspendEncoding() {
            flushBase64();
            this.suspendEncoding = true;
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(int i10) {
            if (this.suspendEncoding) {
                ((FilterOutputStream) this).out.write(i10);
            } else if (this.encode) {
                byte[] bArr = this.buffer;
                int i11 = this.position;
                int i12 = i11 + 1;
                this.position = i12;
                bArr[i11] = (byte) i10;
                int i13 = this.bufferLength;
                if (i12 < i13) {
                    return;
                }
                ((FilterOutputStream) this).out.write(Base64.encode3to4(this.f24322b4, bArr, i13, this.options));
                int i14 = this.lineLength + 4;
                this.lineLength = i14;
                if (this.breakLines && i14 >= Base64.MAX_LINE_LENGTH) {
                    ((FilterOutputStream) this).out.write(10);
                    this.lineLength = 0;
                }
                this.position = 0;
            } else {
                byte b10 = this.decodabet[i10 & 127];
                if (b10 <= -5) {
                    if (b10 != -5) {
                        throw new IOException("Invalid character in Base64 data.");
                    }
                    return;
                }
                byte[] bArr2 = this.buffer;
                int i15 = this.position;
                int i16 = i15 + 1;
                this.position = i16;
                bArr2[i15] = (byte) i10;
                if (i16 < this.bufferLength) {
                    return;
                }
                ((FilterOutputStream) this).out.write(this.f24322b4, 0, Base64.decode4to3(bArr2, 0, this.f24322b4, 0, this.options));
                this.position = 0;
            }
        }

        public OutputStream(java.io.OutputStream outputStream, int i10) {
            super(outputStream);
            boolean z10 = true;
            this.breakLines = (i10 & 8) != 0;
            z10 = (i10 & 1) == 0 ? false : z10;
            this.encode = z10;
            int i11 = z10 ? 3 : 4;
            this.bufferLength = i11;
            this.buffer = new byte[i11];
            this.position = 0;
            this.lineLength = 0;
            this.suspendEncoding = false;
            this.f24322b4 = new byte[4];
            this.options = i10;
            this.decodabet = Base64.getDecodabet(i10);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) {
            if (this.suspendEncoding) {
                ((FilterOutputStream) this).out.write(bArr, i10, i11);
                return;
            }
            for (int i12 = 0; i12 < i11; i12++) {
                write(bArr[i10 + i12]);
            }
        }
    }

    private Base64() {
    }

    public static byte[] decode(byte[] bArr) {
        return decode(bArr, 0, bArr.length, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int decode4to3(byte[] bArr, int i10, byte[] bArr2, int i11, int i12) {
        int i13;
        int i14;
        if (bArr != null) {
            if (bArr2 != null) {
                if (i10 >= 0 && (i13 = i10 + 3) < bArr.length) {
                    if (i11 >= 0 && (i14 = i11 + 2) < bArr2.length) {
                        byte[] decodabet = getDecodabet(i12);
                        byte b10 = bArr[i10 + 2];
                        if (b10 == 61) {
                            bArr2[i11] = (byte) ((((decodabet[bArr[i10 + 1]] & EQUALS_SIGN_ENC) << 12) | ((decodabet[bArr[i10]] & EQUALS_SIGN_ENC) << 18)) >>> 16);
                            return 1;
                        }
                        byte b11 = bArr[i13];
                        if (b11 == 61) {
                            int i15 = ((decodabet[bArr[i10 + 1]] & EQUALS_SIGN_ENC) << 12) | ((decodabet[bArr[i10]] & EQUALS_SIGN_ENC) << 18) | ((decodabet[b10] & EQUALS_SIGN_ENC) << 6);
                            bArr2[i11] = (byte) (i15 >>> 16);
                            bArr2[i11 + 1] = (byte) (i15 >>> 8);
                            return 2;
                        }
                        int i16 = ((decodabet[bArr[i10 + 1]] & EQUALS_SIGN_ENC) << 12) | ((decodabet[bArr[i10]] & EQUALS_SIGN_ENC) << 18) | ((decodabet[b10] & EQUALS_SIGN_ENC) << 6) | (decodabet[b11] & EQUALS_SIGN_ENC);
                        bArr2[i11] = (byte) (i16 >> 16);
                        bArr2[i11 + 1] = (byte) (i16 >> 8);
                        bArr2[i14] = (byte) i16;
                        return 3;
                    }
                    throw new IllegalArgumentException(String.format("Destination array with length %d cannot have offset of %d and still store three bytes.", Integer.valueOf(bArr2.length), Integer.valueOf(i11)));
                }
                throw new IllegalArgumentException(String.format("Source array with length %d cannot have offset of %d and still process four bytes.", Integer.valueOf(bArr.length), Integer.valueOf(i10)));
            }
            throw new NullPointerException("Destination array was null.");
        }
        throw new NullPointerException("Source array was null.");
    }

    public static void decodeFileToFile(String str, String str2) {
        Throwable th2;
        BufferedOutputStream bufferedOutputStream;
        byte[] decodeFromFile = decodeFromFile(str);
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            try {
                bufferedOutputStream = new BufferedOutputStream(f.r(new FileOutputStream(str2), str2));
            } catch (Throwable th3) {
                th2 = th3;
            }
            try {
                bufferedOutputStream.write(decodeFromFile);
                try {
                    bufferedOutputStream.close();
                } catch (Exception unused) {
                }
            } catch (IOException e10) {
            } catch (Throwable th4) {
                th2 = th4;
                bufferedOutputStream2 = bufferedOutputStream;
                try {
                    bufferedOutputStream2.close();
                } catch (Exception unused2) {
                }
                throw th2;
            }
        } catch (IOException e11) {
            throw e11;
        }
    }

    public static byte[] decodeFromFile(String str) {
        Throwable th2;
        InputStream inputStream = null;
        try {
            try {
                File file = new File(str);
                if (file.length() <= 2147483647L) {
                    byte[] bArr = new byte[(int) file.length()];
                    InputStream inputStream2 = new InputStream(new BufferedInputStream(N.t(new FileInputStream(file), file)), 0);
                    int i10 = 0;
                    while (true) {
                        try {
                            int read = inputStream2.read(bArr, i10, 4096);
                            if (read < 0) {
                                break;
                            }
                            i10 += read;
                        } catch (IOException e10) {
                            throw e10;
                        } catch (Throwable th3) {
                            th2 = th3;
                            inputStream = inputStream2;
                            try {
                                inputStream.close();
                            } catch (Exception unused) {
                            }
                            throw th2;
                        }
                    }
                    byte[] bArr2 = new byte[i10];
                    System.arraycopy(bArr, 0, bArr2, 0, i10);
                    try {
                        inputStream2.close();
                    } catch (Exception unused2) {
                    }
                    return bArr2;
                }
                throw new IOException("File is too big for this convenience method (" + file.length() + " bytes).");
            } catch (IOException e11) {
                throw e11;
            }
        } catch (Throwable th4) {
            th2 = th4;
        }
    }

    public static void decodeToFile(String str, String str2) {
        Throwable th2;
        OutputStream outputStream;
        OutputStream outputStream2 = null;
        try {
            try {
                outputStream = new OutputStream(f.r(new FileOutputStream(str2), str2), 0);
            } catch (Throwable th3) {
                th2 = th3;
            }
            try {
                outputStream.write(str.getBytes(PREFERRED_ENCODING));
                try {
                    outputStream.close();
                } catch (Exception unused) {
                }
            } catch (IOException e10) {
            } catch (Throwable th4) {
                th2 = th4;
                outputStream2 = outputStream;
                try {
                    outputStream2.close();
                } catch (Exception unused2) {
                }
                throw th2;
            }
        } catch (IOException e11) {
            throw e11;
        }
    }

    public static Object decodeToObject(String str) {
        return decodeToObject(str, 0, null);
    }

    public static void encode(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        byte[] bArr = new byte[3];
        byte[] bArr2 = new byte[4];
        while (byteBuffer.hasRemaining()) {
            int min = Math.min(3, byteBuffer.remaining());
            byteBuffer.get(bArr, 0, min);
            encode3to4(bArr2, bArr, min, 0);
            byteBuffer2.put(bArr2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] encode3to4(byte[] bArr, byte[] bArr2, int i10, int i11) {
        encode3to4(bArr2, 0, i10, bArr, 0, i11);
        return bArr;
    }

    public static String encodeBytes(byte[] bArr) {
        try {
            return encodeBytes(bArr, 0, bArr.length, 0);
        } catch (IOException unused) {
            return null;
        }
    }

    public static byte[] encodeBytesToBytes(byte[] bArr) {
        try {
            return encodeBytesToBytes(bArr, 0, bArr.length, 0);
        } catch (IOException unused) {
            return null;
        }
    }

    public static void encodeFileToFile(String str, String str2) {
        Throwable th2;
        BufferedOutputStream bufferedOutputStream;
        String encodeFromFile = encodeFromFile(str);
        BufferedOutputStream bufferedOutputStream2 = null;
        try {
            try {
                bufferedOutputStream = new BufferedOutputStream(f.r(new FileOutputStream(str2), str2));
            } catch (IOException e10) {
                throw e10;
            }
        } catch (Throwable th3) {
            th2 = th3;
        }
        try {
            bufferedOutputStream.write(encodeFromFile.getBytes(PREFERRED_ENCODING));
            try {
                bufferedOutputStream.close();
            } catch (Exception unused) {
            }
        } catch (IOException e11) {
        } catch (Throwable th4) {
            th2 = th4;
            bufferedOutputStream2 = bufferedOutputStream;
            try {
                bufferedOutputStream2.close();
            } catch (Exception unused2) {
            }
            throw th2;
        }
    }

    public static String encodeFromFile(String str) {
        Throwable th2;
        InputStream inputStream = null;
        try {
            try {
                File file = new File(str);
                byte[] bArr = new byte[Math.max((int) ((file.length() * 1.4d) + 1.0d), 40)];
                InputStream inputStream2 = new InputStream(new BufferedInputStream(N.t(new FileInputStream(file), file)), 1);
                int i10 = 0;
                while (true) {
                    try {
                        int read = inputStream2.read(bArr, i10, 4096);
                        if (read < 0) {
                            break;
                        }
                        i10 += read;
                    } catch (IOException e10) {
                        throw e10;
                    } catch (Throwable th3) {
                        th2 = th3;
                        inputStream = inputStream2;
                        try {
                            inputStream.close();
                        } catch (Exception unused) {
                        }
                        throw th2;
                    }
                }
                String str2 = new String(bArr, 0, i10, PREFERRED_ENCODING);
                try {
                    inputStream2.close();
                } catch (Exception unused2) {
                }
                return str2;
            } catch (IOException e11) {
                throw e11;
            }
        } catch (Throwable th4) {
            th2 = th4;
        }
    }

    public static String encodeObject(Serializable serializable) {
        return encodeObject(serializable, 0);
    }

    public static void encodeToFile(byte[] bArr, String str) {
        Throwable th2;
        OutputStream outputStream;
        if (bArr != null) {
            OutputStream outputStream2 = null;
            try {
                try {
                    outputStream = new OutputStream(f.r(new FileOutputStream(str), str), 1);
                } catch (IOException e10) {
                    throw e10;
                }
            } catch (Throwable th3) {
                th2 = th3;
            }
            try {
                outputStream.write(bArr);
                try {
                    outputStream.close();
                    return;
                } catch (Exception unused) {
                    return;
                }
            } catch (IOException e11) {
                throw e11;
            } catch (Throwable th4) {
                th2 = th4;
                outputStream2 = outputStream;
                try {
                    outputStream2.close();
                } catch (Exception unused2) {
                }
                throw th2;
            }
        }
        throw new NullPointerException("Data to encode was null.");
    }

    private static final byte[] getAlphabet(int i10) {
        if ((i10 & 16) == 16) {
            return _URL_SAFE_ALPHABET;
        }
        if ((i10 & 32) == 32) {
            return _ORDERED_ALPHABET;
        }
        return _STANDARD_ALPHABET;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final byte[] getDecodabet(int i10) {
        if ((i10 & 16) == 16) {
            return _URL_SAFE_DECODABET;
        }
        if ((i10 & 32) == 32) {
            return _ORDERED_DECODABET;
        }
        return _STANDARD_DECODABET;
    }

    public static byte[] decode(byte[] bArr, int i10, int i11, int i12) {
        int i13;
        if (bArr != null) {
            if (i10 < 0 || (i13 = i10 + i11) > bArr.length) {
                throw new IllegalArgumentException(String.format("Source array with length %d cannot have offset of %d and process %d bytes.", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            if (i11 == 0) {
                return new byte[0];
            }
            if (i11 >= 4) {
                byte[] decodabet = getDecodabet(i12);
                byte[] bArr2 = new byte[(i11 * 3) / 4];
                byte[] bArr3 = new byte[4];
                int i14 = 0;
                int i15 = 0;
                while (i10 < i13) {
                    byte b10 = bArr[i10];
                    byte b11 = decodabet[b10 & EQUALS_SIGN_ENC];
                    if (b11 < -5) {
                        throw new IOException(String.format("Bad Base64 input character decimal %d in array position %d", Integer.valueOf(bArr[i10] & EQUALS_SIGN_ENC), Integer.valueOf(i10)));
                    }
                    if (b11 >= -1) {
                        int i16 = i14 + 1;
                        bArr3[i14] = b10;
                        if (i16 > 3) {
                            i15 += decode4to3(bArr3, 0, bArr2, i15, i12);
                            if (bArr[i10] == 61) {
                                break;
                            }
                            i14 = 0;
                        } else {
                            i14 = i16;
                        }
                    }
                    i10++;
                }
                byte[] bArr4 = new byte[i15];
                System.arraycopy(bArr2, 0, bArr4, 0, i15);
                return bArr4;
            }
            throw new IllegalArgumentException(a.e("Base64-encoded string must have at least four characters, but length specified was ", i11));
        }
        throw new NullPointerException("Cannot decode null source array.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.ObjectInputStream] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v8 */
    public static Object decodeToObject(String str, int i10, final ClassLoader classLoader) {
        ObjectInputStream objectInputStream;
        Throwable th2;
        IOException e10;
        ClassNotFoundException e11;
        ByteArrayInputStream byteArrayInputStream;
        ObjectInputStream objectInputStream2;
        byte[] decode = decode(str, i10);
        ByteArrayInputStream byteArrayInputStream2 = null;
        r2 = null;
        r2 = null;
        ObjectInputStream objectInputStream3 = null;
        byteArrayInputStream2 = null;
        try {
            try {
                byteArrayInputStream = new ByteArrayInputStream(decode);
            } catch (Throwable th3) {
                th2 = th3;
                objectInputStream = classLoader;
            }
        } catch (IOException e12) {
            e10 = e12;
        } catch (ClassNotFoundException e13) {
            e11 = e13;
        } catch (Throwable th4) {
            th2 = th4;
            objectInputStream = 0;
        }
        try {
            if (classLoader == null) {
                objectInputStream2 = new ObjectInputStream(byteArrayInputStream);
            } else {
                objectInputStream2 = new ObjectInputStream(byteArrayInputStream) { // from class: android.gov.nist.javax.sip.stack.Base64.1
                    @Override // java.io.ObjectInputStream
                    public Class<?> resolveClass(ObjectStreamClass objectStreamClass) {
                        Class<?> cls = Class.forName(objectStreamClass.getName(), false, classLoader);
                        if (cls == null) {
                            return super.resolveClass(objectStreamClass);
                        }
                        return cls;
                    }
                };
            }
            objectInputStream3 = objectInputStream2;
            Object readObject = objectInputStream3.readObject();
            try {
                byteArrayInputStream.close();
            } catch (Exception unused) {
            }
            try {
                objectInputStream3.close();
            } catch (Exception unused2) {
            }
            return readObject;
        } catch (IOException e14) {
            e10 = e14;
            throw e10;
        } catch (ClassNotFoundException e15) {
            e11 = e15;
            throw e11;
        } catch (Throwable th5) {
            th2 = th5;
            objectInputStream = objectInputStream3;
            byteArrayInputStream2 = byteArrayInputStream;
            try {
                byteArrayInputStream2.close();
            } catch (Exception unused3) {
            }
            try {
                objectInputStream.close();
            } catch (Exception unused4) {
            }
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] encode3to4(byte[] bArr, int i10, int i11, byte[] bArr2, int i12, int i13) {
        byte[] alphabet = getAlphabet(i13);
        int i14 = 0;
        int i15 = (i11 > 0 ? (bArr[i10] << 24) >>> 8 : 0) | (i11 > 1 ? (bArr[i10 + 1] << 24) >>> 16 : 0);
        if (i11 > 2) {
            i14 = (bArr[i10 + 2] << 24) >>> 24;
        }
        int i16 = i15 | i14;
        if (i11 == 1) {
            bArr2[i12] = alphabet[i16 >>> 18];
            bArr2[i12 + 1] = alphabet[(i16 >>> 12) & 63];
            bArr2[i12 + 2] = EQUALS_SIGN;
            bArr2[i12 + 3] = EQUALS_SIGN;
            return bArr2;
        } else if (i11 == 2) {
            bArr2[i12] = alphabet[i16 >>> 18];
            bArr2[i12 + 1] = alphabet[(i16 >>> 12) & 63];
            bArr2[i12 + 2] = alphabet[(i16 >>> 6) & 63];
            bArr2[i12 + 3] = EQUALS_SIGN;
            return bArr2;
        } else if (i11 != 3) {
            return bArr2;
        } else {
            bArr2[i12] = alphabet[i16 >>> 18];
            bArr2[i12 + 1] = alphabet[(i16 >>> 12) & 63];
            bArr2[i12 + 2] = alphabet[(i16 >>> 6) & 63];
            bArr2[i12 + 3] = alphabet[i16 & 63];
            return bArr2;
        }
    }

    public static String encodeBytes(byte[] bArr, int i10) {
        return encodeBytes(bArr, 0, bArr.length, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [java.io.OutputStream, java.util.zip.GZIPOutputStream] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static byte[] encodeBytesToBytes(byte[] bArr, int i10, int i11, int i12) {
        OutputStream outputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        Throwable th2;
        ?? r42;
        IOException e10;
        if (bArr != null) {
            if (i10 < 0) {
                throw new IllegalArgumentException(a.e("Cannot have negative offset: ", i10));
            }
            if (i11 >= 0) {
                if (i10 + i11 > bArr.length) {
                    throw new IllegalArgumentException(String.format("Cannot have offset of %d and length of %d with array of length %d", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(bArr.length)));
                }
                if ((i12 & 2) != 0) {
                    ByteArrayOutputStream byteArrayOutputStream2 = null;
                    try {
                        byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            outputStream = new OutputStream(byteArrayOutputStream, i12 | 1);
                            try {
                                r42 = new GZIPOutputStream(outputStream);
                                try {
                                    r42.write(bArr, i10, i11);
                                    r42.close();
                                    try {
                                        r42.close();
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        outputStream.close();
                                    } catch (Exception unused2) {
                                    }
                                    try {
                                        byteArrayOutputStream.close();
                                    } catch (Exception unused3) {
                                    }
                                    return byteArrayOutputStream.toByteArray();
                                } catch (IOException e11) {
                                    e10 = e11;
                                    byteArrayOutputStream2 = byteArrayOutputStream;
                                    r42 = r42;
                                    try {
                                        throw e10;
                                    } catch (Throwable th3) {
                                        th2 = th3;
                                        byteArrayOutputStream = byteArrayOutputStream2;
                                        byteArrayOutputStream2 = r42;
                                        try {
                                            byteArrayOutputStream2.close();
                                        } catch (Exception unused4) {
                                        }
                                        try {
                                            outputStream.close();
                                        } catch (Exception unused5) {
                                        }
                                        try {
                                            byteArrayOutputStream.close();
                                        } catch (Exception unused6) {
                                        }
                                        throw th2;
                                    }
                                } catch (Throwable th4) {
                                    th2 = th4;
                                    byteArrayOutputStream2 = r42;
                                    byteArrayOutputStream2.close();
                                    outputStream.close();
                                    byteArrayOutputStream.close();
                                    throw th2;
                                }
                            } catch (IOException e12) {
                                e10 = e12;
                                r42 = 0;
                            } catch (Throwable th5) {
                                th2 = th5;
                                byteArrayOutputStream2.close();
                                outputStream.close();
                                byteArrayOutputStream.close();
                                throw th2;
                            }
                        } catch (IOException e13) {
                            e10 = e13;
                            outputStream = null;
                            r42 = 0;
                        } catch (Throwable th6) {
                            th2 = th6;
                            outputStream = null;
                        }
                    } catch (IOException e14) {
                        e10 = e14;
                        outputStream = null;
                        r42 = 0;
                    } catch (Throwable th7) {
                        th2 = th7;
                        byteArrayOutputStream = null;
                        outputStream = null;
                    }
                } else {
                    boolean z10 = (i12 & 8) != 0;
                    int i13 = ((i11 / 3) * 4) + (i11 % 3 > 0 ? 4 : 0);
                    if (z10) {
                        i13 += i13 / MAX_LINE_LENGTH;
                    }
                    int i14 = i13;
                    byte[] bArr2 = new byte[i14];
                    int i15 = i11 - 2;
                    int i16 = 0;
                    int i17 = 0;
                    int i18 = 0;
                    while (i16 < i15) {
                        int i19 = i16;
                        int i20 = i15;
                        byte[] bArr3 = bArr2;
                        encode3to4(bArr, i16 + i10, 3, bArr2, i17, i12);
                        int i21 = i18 + 4;
                        if (!z10 || i21 < MAX_LINE_LENGTH) {
                            i18 = i21;
                        } else {
                            bArr3[i17 + 4] = NEW_LINE;
                            i17++;
                            i18 = 0;
                        }
                        i16 = i19 + 3;
                        i17 += 4;
                        bArr2 = bArr3;
                        i15 = i20;
                    }
                    int i22 = i16;
                    byte[] bArr4 = bArr2;
                    if (i22 < i11) {
                        encode3to4(bArr, i22 + i10, i11 - i22, bArr4, i17, i12);
                        i17 += 4;
                    }
                    int i23 = i17;
                    if (i23 > i14 - 1) {
                        return bArr4;
                    }
                    byte[] bArr5 = new byte[i23];
                    System.arraycopy(bArr4, 0, bArr5, 0, i23);
                    return bArr5;
                }
            } else {
                throw new IllegalArgumentException(a.e("Cannot have length offset: ", i11));
            }
        } else {
            throw new NullPointerException("Cannot serialize a null array.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String encodeObject(Serializable serializable, int i10) {
        java.io.OutputStream outputStream;
        IOException e10;
        OutputStream outputStream2;
        java.io.OutputStream outputStream3;
        ByteArrayOutputStream byteArrayOutputStream;
        if (serializable != null) {
            ObjectOutputStream objectOutputStream = null;
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    outputStream2 = new OutputStream(byteArrayOutputStream, i10 | 1);
                    try {
                        if ((i10 & 2) != 0) {
                            outputStream = new GZIPOutputStream(outputStream2);
                            try {
                                objectOutputStream = new ObjectOutputStream(outputStream);
                                outputStream = outputStream;
                            } catch (IOException e11) {
                                e10 = e11;
                                outputStream3 = objectOutputStream;
                                objectOutputStream = byteArrayOutputStream;
                                outputStream = outputStream;
                                try {
                                    throw e10;
                                } catch (Throwable th2) {
                                    th = th2;
                                    java.io.OutputStream outputStream4 = outputStream3;
                                    byteArrayOutputStream = objectOutputStream;
                                    objectOutputStream = outputStream4;
                                    try {
                                        objectOutputStream.close();
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        outputStream.close();
                                    } catch (Exception unused2) {
                                    }
                                    try {
                                        outputStream2.close();
                                    } catch (Exception unused3) {
                                    }
                                    try {
                                        byteArrayOutputStream.close();
                                    } catch (Exception unused4) {
                                    }
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                objectOutputStream.close();
                                outputStream.close();
                                outputStream2.close();
                                byteArrayOutputStream.close();
                                throw th;
                            }
                        } else {
                            objectOutputStream = new ObjectOutputStream(outputStream2);
                            outputStream = null;
                        }
                        objectOutputStream.writeObject(serializable);
                        try {
                            objectOutputStream.close();
                        } catch (Exception unused5) {
                        }
                        try {
                            outputStream.close();
                        } catch (Exception unused6) {
                        }
                        try {
                            outputStream2.close();
                        } catch (Exception unused7) {
                        }
                        try {
                            byteArrayOutputStream.close();
                        } catch (Exception unused8) {
                        }
                        try {
                            return new String(byteArrayOutputStream.toByteArray(), PREFERRED_ENCODING);
                        } catch (UnsupportedEncodingException unused9) {
                            return new String(byteArrayOutputStream.toByteArray());
                        }
                    } catch (IOException e12) {
                        e10 = e12;
                        java.io.OutputStream outputStream5 = objectOutputStream;
                        objectOutputStream = byteArrayOutputStream;
                        outputStream3 = outputStream5;
                        outputStream = outputStream5;
                    } catch (Throwable th4) {
                        th = th4;
                        outputStream = objectOutputStream;
                    }
                } catch (IOException e13) {
                    e10 = e13;
                    outputStream = null;
                    outputStream2 = null;
                    objectOutputStream = byteArrayOutputStream;
                    outputStream3 = null;
                } catch (Throwable th5) {
                    th = th5;
                    outputStream = null;
                    outputStream2 = null;
                }
            } catch (IOException e14) {
                e10 = e14;
                outputStream = null;
                outputStream3 = null;
                outputStream2 = null;
            } catch (Throwable th6) {
                th = th6;
                outputStream = null;
                byteArrayOutputStream = 0;
                outputStream2 = null;
            }
        } else {
            throw new NullPointerException("Cannot serialize a null object.");
        }
    }

    public static String encodeBytes(byte[] bArr, int i10, int i11) {
        try {
            return encodeBytes(bArr, i10, i11, 0);
        } catch (IOException unused) {
            return null;
        }
    }

    public static String encodeBytes(byte[] bArr, int i10, int i11, int i12) {
        byte[] encodeBytesToBytes = encodeBytesToBytes(bArr, i10, i11, i12);
        try {
            return new String(encodeBytesToBytes, PREFERRED_ENCODING);
        } catch (UnsupportedEncodingException unused) {
            return new String(encodeBytesToBytes);
        }
    }

    public static void encode(ByteBuffer byteBuffer, CharBuffer charBuffer) {
        byte[] bArr = new byte[3];
        byte[] bArr2 = new byte[4];
        while (byteBuffer.hasRemaining()) {
            int min = Math.min(3, byteBuffer.remaining());
            byteBuffer.get(bArr, 0, min);
            encode3to4(bArr2, bArr, min, 0);
            for (int i10 = 0; i10 < 4; i10++) {
                charBuffer.put((char) (bArr2[i10] & EQUALS_SIGN_ENC));
            }
        }
    }

    public static byte[] decode(String str) {
        return decode(str, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v5 */
    public static byte[] decode(String str, int i10) {
        byte[] bArr;
        ByteArrayInputStream length;
        Throwable th2;
        GZIPInputStream gZIPInputStream;
        ByteArrayInputStream byteArrayInputStream;
        IOException e10;
        if (str != null) {
            try {
                bArr = str.getBytes(PREFERRED_ENCODING);
            } catch (UnsupportedEncodingException unused) {
                bArr = str.getBytes();
            }
            byte[] decode = decode(bArr, 0, bArr.length, i10);
            boolean z10 = (i10 & 4) != 0;
            if (decode != null && (length = decode.length) >= 4 && !z10 && 35615 == ((decode[0] & EQUALS_SIGN_ENC) | ((decode[1] << 8) & 65280))) {
                byte[] bArr2 = new byte[2048];
                ByteArrayOutputStream byteArrayOutputStream = null;
                try {
                    try {
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        try {
                            byteArrayInputStream = new ByteArrayInputStream(decode);
                            try {
                                gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                                while (true) {
                                    try {
                                        int read = gZIPInputStream.read(bArr2);
                                        if (read < 0) {
                                            break;
                                        }
                                        byteArrayOutputStream2.write(bArr2, 0, read);
                                    } catch (IOException e11) {
                                        e10 = e11;
                                        byteArrayOutputStream = byteArrayOutputStream2;
                                        byteArrayInputStream = byteArrayInputStream;
                                        try {
                                            e10.printStackTrace();
                                            byteArrayOutputStream.close();
                                            length = byteArrayInputStream;
                                            gZIPInputStream.close();
                                            length.close();
                                            return decode;
                                        } catch (Throwable th3) {
                                            th2 = th3;
                                            try {
                                                byteArrayOutputStream.close();
                                            } catch (Exception unused2) {
                                            }
                                            try {
                                                gZIPInputStream.close();
                                            } catch (Exception unused3) {
                                            }
                                            try {
                                                byteArrayInputStream.close();
                                            } catch (Exception unused4) {
                                            }
                                            throw th2;
                                        }
                                    } catch (Throwable th4) {
                                        th2 = th4;
                                        byteArrayOutputStream = byteArrayOutputStream2;
                                        byteArrayOutputStream.close();
                                        gZIPInputStream.close();
                                        byteArrayInputStream.close();
                                        throw th2;
                                    }
                                }
                                decode = byteArrayOutputStream2.toByteArray();
                                byteArrayOutputStream2.close();
                                length = byteArrayInputStream;
                            } catch (IOException e12) {
                                e10 = e12;
                                gZIPInputStream = null;
                            } catch (Throwable th5) {
                                th2 = th5;
                                gZIPInputStream = null;
                            }
                        } catch (IOException e13) {
                            e10 = e13;
                            byteArrayInputStream = null;
                            gZIPInputStream = null;
                        } catch (Throwable th6) {
                            th2 = th6;
                            byteArrayInputStream = null;
                            gZIPInputStream = null;
                        }
                    } catch (Exception unused5) {
                    }
                } catch (IOException e14) {
                    e10 = e14;
                    byteArrayInputStream = null;
                    gZIPInputStream = null;
                } catch (Throwable th7) {
                    th2 = th7;
                    byteArrayInputStream = null;
                    gZIPInputStream = null;
                }
                try {
                    gZIPInputStream.close();
                } catch (Exception unused6) {
                }
                try {
                    length.close();
                } catch (Exception unused7) {
                }
            }
            return decode;
        }
        throw new NullPointerException("Input string was null.");
    }
}
