package T1;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import k6.AbstractC4194d;

/* loaded from: classes.dex */
public class b extends InputStream implements DataInput {

    /* renamed from: Y  reason: collision with root package name */
    public final DataInputStream f16835Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f16836Z;

    /* renamed from: h0  reason: collision with root package name */
    public ByteOrder f16837h0;

    /* renamed from: i0  reason: collision with root package name */
    public byte[] f16838i0;

    /* renamed from: j0  reason: collision with root package name */
    public final int f16839j0;

    public b(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
        this.f16839j0 = bArr.length;
    }

    public final void a(int i10) {
        int i11 = 0;
        while (i11 < i10) {
            DataInputStream dataInputStream = this.f16835Y;
            int i12 = i10 - i11;
            int skip = (int) dataInputStream.skip(i12);
            if (skip <= 0) {
                if (this.f16838i0 == null) {
                    this.f16838i0 = new byte[8192];
                }
                skip = dataInputStream.read(this.f16838i0, 0, Math.min(8192, i12));
                if (skip == -1) {
                    throw new EOFException(AbstractC4194d.v("Reached EOF while skipping ", i10, " bytes."));
                }
            }
            i11 += skip;
        }
        this.f16836Z += i11;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f16835Y.available();
    }

    @Override // java.io.InputStream
    public final void mark(int i10) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.f16836Z++;
        return this.f16835Y.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.f16836Z++;
        return this.f16835Y.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() {
        this.f16836Z++;
        int read = this.f16835Y.read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.f16836Z += 2;
        return this.f16835Y.readChar();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i10, int i11) {
        this.f16836Z += i11;
        this.f16835Y.readFully(bArr, i10, i11);
    }

    @Override // java.io.DataInput
    public final int readInt() {
        this.f16836Z += 4;
        DataInputStream dataInputStream = this.f16835Y;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        if ((read | read2 | read3 | read4) >= 0) {
            ByteOrder byteOrder = this.f16837h0;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
            }
            throw new IOException("Invalid byte order: " + this.f16837h0);
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final String readLine() {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() {
        this.f16836Z += 8;
        DataInputStream dataInputStream = this.f16835Y;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        int read5 = dataInputStream.read();
        int read6 = dataInputStream.read();
        int read7 = dataInputStream.read();
        int read8 = dataInputStream.read();
        if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
            ByteOrder byteOrder = this.f16837h0;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
            }
            throw new IOException("Invalid byte order: " + this.f16837h0);
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final short readShort() {
        this.f16836Z += 2;
        DataInputStream dataInputStream = this.f16835Y;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) >= 0) {
            ByteOrder byteOrder = this.f16837h0;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (short) ((read2 << 8) + read);
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (short) ((read << 8) + read2);
            }
            throw new IOException("Invalid byte order: " + this.f16837h0);
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.f16836Z += 2;
        return this.f16835Y.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.f16836Z++;
        return this.f16835Y.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() {
        this.f16836Z += 2;
        DataInputStream dataInputStream = this.f16835Y;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) >= 0) {
            ByteOrder byteOrder = this.f16837h0;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (read2 << 8) + read;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (read << 8) + read2;
            }
            throw new IOException("Invalid byte order: " + this.f16837h0);
        }
        throw new EOFException();
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i10) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    public b(InputStream inputStream) {
        this(inputStream, ByteOrder.BIG_ENDIAN);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        int read = this.f16835Y.read(bArr, i10, i11);
        this.f16836Z += read;
        return read;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) {
        this.f16836Z += bArr.length;
        this.f16835Y.readFully(bArr);
    }

    public b(InputStream inputStream, ByteOrder byteOrder) {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f16835Y = dataInputStream;
        dataInputStream.mark(0);
        this.f16836Z = 0;
        this.f16837h0 = byteOrder;
        this.f16839j0 = inputStream instanceof b ? ((b) inputStream).f16839j0 : -1;
    }
}
