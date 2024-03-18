package ji;

import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* renamed from: ji.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface AbstractC4137l extends AbstractC4122K, ReadableByteChannel {
    long A(C4115D c4115d);

    long C0();

    long D0(C4138m c4138m);

    boolean H();

    void J0(long j6);

    void K0(C4135j c4135j, long j6);

    long O0();

    C4134i Q0();

    String R(long j6);

    C4135j d();

    String h0(Charset charset);

    boolean o0(long j6);

    int p0(C4112A c4112a);

    C4116E peek();

    C4138m q(long j6);

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    long readLong();

    short readShort();

    void skip(long j6);

    String t0();

    int v0();
}
