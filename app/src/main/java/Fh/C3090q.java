package fh;

import eh.AbstractC2904d;
import id.AbstractC3557B;
import jf.C3966p;
import jf.C3968r;
import jf.C3970t;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: fh.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3090q extends AbstractC3557B {

    /* renamed from: h  reason: collision with root package name */
    public final AbstractC3074a f30890h;

    /* renamed from: i  reason: collision with root package name */
    public final gh.d f30891i;

    public C3090q(AbstractC3074a abstractC3074a, AbstractC2904d abstractC2904d) {
        AbstractC3557B.c0("lexer", abstractC3074a);
        AbstractC3557B.c0("json", abstractC2904d);
        this.f30890h = abstractC3074a;
        this.f30891i = abstractC2904d.f29417b;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a A[Catch: IllegalArgumentException -> 0x0031, TryCatch #0 {IllegalArgumentException -> 0x0031, blocks: (B:3:0x0007, B:5:0x0012, B:8:0x0022, B:10:0x002a, B:12:0x002d, B:13:0x0030), top: B:16:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002d A[Catch: IllegalArgumentException -> 0x0031, TryCatch #0 {IllegalArgumentException -> 0x0031, blocks: (B:3:0x0007, B:5:0x0012, B:8:0x0022, B:10:0x002a, B:12:0x002d, B:13:0x0030), top: B:16:0x0007 }] */
    @Override // id.AbstractC3557B, kotlinx.serialization.encoding.Decoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final short B() {
        jf.w wVar;
        AbstractC3074a abstractC3074a = this.f30890h;
        String l10 = abstractC3074a.l();
        try {
            AbstractC3557B.c0("<this>", l10);
            C3968r j22 = R4.b.j2(l10);
            if (j22 != null) {
                int i10 = j22.f36170Y;
                if (Integer.compare(Integer.MIN_VALUE ^ i10, -2147418113) <= 0) {
                    wVar = new jf.w((short) i10);
                    if (wVar == null) {
                        return wVar.f36175Y;
                    }
                    Lg.m.U1(l10);
                    throw null;
                }
            }
            wVar = null;
            if (wVar == null) {
            }
        } catch (IllegalArgumentException unused) {
            AbstractC3074a.r(abstractC3074a, android.gov.nist.core.a.h("Failed to parse type 'UShort' for input '", l10, '\''), 0, null, 6);
            throw null;
        }
    }

    @Override // kotlinx.serialization.encoding.Decoder, ch.AbstractC2430a
    public final gh.d a() {
        return this.f30891i;
    }

    @Override // id.AbstractC3557B, kotlinx.serialization.encoding.Decoder
    public final int l() {
        AbstractC3074a abstractC3074a = this.f30890h;
        String l10 = abstractC3074a.l();
        try {
            AbstractC3557B.c0("<this>", l10);
            C3968r j22 = R4.b.j2(l10);
            if (j22 != null) {
                return j22.f36170Y;
            }
            Lg.m.U1(l10);
            throw null;
        } catch (IllegalArgumentException unused) {
            AbstractC3074a.r(abstractC3074a, android.gov.nist.core.a.h("Failed to parse type 'UInt' for input '", l10, '\''), 0, null, 6);
            throw null;
        }
    }

    @Override // id.AbstractC3557B, kotlinx.serialization.encoding.Decoder
    public final long p() {
        AbstractC3074a abstractC3074a = this.f30890h;
        String l10 = abstractC3074a.l();
        try {
            AbstractC3557B.c0("<this>", l10);
            C3970t k22 = R4.b.k2(l10);
            if (k22 != null) {
                return k22.f36172Y;
            }
            Lg.m.U1(l10);
            throw null;
        } catch (IllegalArgumentException unused) {
            AbstractC3074a.r(abstractC3074a, android.gov.nist.core.a.h("Failed to parse type 'ULong' for input '", l10, '\''), 0, null, 6);
            throw null;
        }
    }

    @Override // ch.AbstractC2430a
    public final int t(SerialDescriptor serialDescriptor) {
        AbstractC3557B.c0("descriptor", serialDescriptor);
        throw new IllegalStateException("unsupported".toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a A[Catch: IllegalArgumentException -> 0x0031, TryCatch #0 {IllegalArgumentException -> 0x0031, blocks: (B:3:0x0007, B:5:0x0012, B:8:0x0022, B:10:0x002a, B:12:0x002d, B:13:0x0030), top: B:16:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002d A[Catch: IllegalArgumentException -> 0x0031, TryCatch #0 {IllegalArgumentException -> 0x0031, blocks: (B:3:0x0007, B:5:0x0012, B:8:0x0022, B:10:0x002a, B:12:0x002d, B:13:0x0030), top: B:16:0x0007 }] */
    @Override // id.AbstractC3557B, kotlinx.serialization.encoding.Decoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte z() {
        C3966p c3966p;
        AbstractC3074a abstractC3074a = this.f30890h;
        String l10 = abstractC3074a.l();
        try {
            AbstractC3557B.c0("<this>", l10);
            C3968r j22 = R4.b.j2(l10);
            if (j22 != null) {
                int i10 = j22.f36170Y;
                if (Integer.compare(Integer.MIN_VALUE ^ i10, -2147483393) <= 0) {
                    c3966p = new C3966p((byte) i10);
                    if (c3966p == null) {
                        return c3966p.f36168Y;
                    }
                    Lg.m.U1(l10);
                    throw null;
                }
            }
            c3966p = null;
            if (c3966p == null) {
            }
        } catch (IllegalArgumentException unused) {
            AbstractC3074a.r(abstractC3074a, android.gov.nist.core.a.h("Failed to parse type 'UByte' for input '", l10, '\''), 0, null, 6);
            throw null;
        }
    }
}
