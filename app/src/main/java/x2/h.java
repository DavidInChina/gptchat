package x2;

import A.AbstractC0044t0;
import android.gov.nist.core.Separators;
import java.nio.ByteBuffer;
import p2.C5065s;
import p2.I;

/* loaded from: classes2.dex */
public class h extends AbstractC6266a {

    /* renamed from: h0  reason: collision with root package name */
    public C5065s f48639h0;

    /* renamed from: j0  reason: collision with root package name */
    public ByteBuffer f48641j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f48642k0;

    /* renamed from: l0  reason: collision with root package name */
    public long f48643l0;

    /* renamed from: m0  reason: collision with root package name */
    public ByteBuffer f48644m0;

    /* renamed from: n0  reason: collision with root package name */
    public final int f48645n0;

    /* renamed from: i0  reason: collision with root package name */
    public final d f48640i0 = new d();

    /* renamed from: o0  reason: collision with root package name */
    public final int f48646o0 = 0;

    static {
        I.a("media3.decoder");
    }

    public h(int i10) {
        this.f48645n0 = i10;
    }

    public void i() {
        this.f48626Z = 0;
        ByteBuffer byteBuffer = this.f48641j0;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f48644m0;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f48642k0 = false;
    }

    public final ByteBuffer j(int i10) {
        int i11;
        int i12 = this.f48645n0;
        if (i12 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i12 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.f48641j0;
        if (byteBuffer == null) {
            i11 = 0;
        } else {
            i11 = byteBuffer.capacity();
        }
        throw new IllegalStateException(AbstractC0044t0.y("Buffer too small (", i11, " < ", i10, Separators.RPAREN));
    }

    public final void k(int i10) {
        int i11 = i10 + this.f48646o0;
        ByteBuffer byteBuffer = this.f48641j0;
        if (byteBuffer == null) {
            this.f48641j0 = j(i11);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i12 = i11 + position;
        if (capacity >= i12) {
            this.f48641j0 = byteBuffer;
            return;
        }
        ByteBuffer j6 = j(i12);
        j6.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            j6.put(byteBuffer);
        }
        this.f48641j0 = j6;
    }

    public final void l() {
        ByteBuffer byteBuffer = this.f48641j0;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f48644m0;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
