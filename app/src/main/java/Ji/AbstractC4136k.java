package ji;

import java.nio.channels.WritableByteChannel;

/* renamed from: ji.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface AbstractC4136k extends AbstractC4120I, WritableByteChannel {
    AbstractC4136k I(int i10);

    long I0(AbstractC4122K abstractC4122K);

    AbstractC4136k M(C4138m c4138m);

    AbstractC4136k M0(long j6);

    AbstractC4136k N();

    AbstractC4136k c0(String str);

    C4135j d();

    @Override // ji.AbstractC4120I, java.io.Flushable
    void flush();

    AbstractC4136k i0(byte[] bArr, int i10, int i11);

    AbstractC4136k l0(long j6);

    AbstractC4136k u();

    AbstractC4136k v(int i10);

    AbstractC4136k y(int i10);

    AbstractC4136k z0(byte[] bArr);
}
