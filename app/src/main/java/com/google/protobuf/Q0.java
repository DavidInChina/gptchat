package com.google.protobuf;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class Q0 implements AbstractC2504f1 {

    /* renamed from: a  reason: collision with root package name */
    public final M0 f27487a;

    /* renamed from: b  reason: collision with root package name */
    public final w1 f27488b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f27489c;

    /* renamed from: d  reason: collision with root package name */
    public final K f27490d;

    public Q0(w1 w1Var, K k10, M0 m02) {
        this.f27488b = w1Var;
        k10.getClass();
        this.f27489c = m02 instanceof GeneratedMessageLite$ExtendableMessage;
        this.f27490d = k10;
        this.f27487a = m02;
    }

    @Override // com.google.protobuf.AbstractC2504f1
    public final boolean a(Object obj, Object obj2) {
        w1 w1Var = this.f27488b;
        w1Var.getClass();
        v1 v1Var = ((AbstractC2497d0) obj).unknownFields;
        w1Var.getClass();
        if (!v1Var.equals(((AbstractC2497d0) obj2).unknownFields)) {
            return false;
        }
        if (this.f27489c) {
            K k10 = this.f27490d;
            k10.getClass();
            S s10 = ((GeneratedMessageLite$ExtendableMessage) obj).extensions;
            k10.getClass();
            return s10.equals(((GeneratedMessageLite$ExtendableMessage) obj2).extensions);
        }
        return true;
    }

    @Override // com.google.protobuf.AbstractC2504f1
    public final int b(Object obj) {
        this.f27488b.getClass();
        int hashCode = ((AbstractC2497d0) obj).unknownFields.hashCode();
        if (this.f27489c) {
            this.f27490d.getClass();
            return (hashCode * 53) + ((GeneratedMessageLite$ExtendableMessage) obj).extensions.f27492a.hashCode();
        }
        return hashCode;
    }

    @Override // com.google.protobuf.AbstractC2504f1
    public final void c(Object obj, Object obj2) {
        AbstractC2507g1.C(this.f27488b, obj, obj2);
        if (this.f27489c) {
            this.f27490d.getClass();
            S s10 = ((GeneratedMessageLite$ExtendableMessage) obj2).extensions;
            if (!s10.f27492a.isEmpty()) {
                ((GeneratedMessageLite$ExtendableMessage) obj).ensureExtensionsAreMutable().n(s10);
            }
        }
    }

    @Override // com.google.protobuf.AbstractC2504f1
    public final void d(Object obj) {
        this.f27488b.getClass();
        w1.b(obj);
        this.f27490d.getClass();
        K.c(obj);
    }

    @Override // com.google.protobuf.AbstractC2504f1
    public final boolean e(Object obj) {
        this.f27490d.getClass();
        return ((GeneratedMessageLite$ExtendableMessage) obj).extensions.j();
    }

    @Override // com.google.protobuf.AbstractC2504f1
    public final int f(Object obj) {
        this.f27488b.getClass();
        v1 v1Var = ((AbstractC2497d0) obj).unknownFields;
        int i10 = v1Var.f27631d;
        if (i10 == -1) {
            int i11 = 0;
            for (int i12 = 0; i12 < v1Var.f27628a; i12++) {
                i11 += AbstractC2549y.X(3, (AbstractC2534q) v1Var.f27630c[i12]) + AbstractC2549y.p0(2, v1Var.f27629b[i12] >>> 3) + (AbstractC2549y.o0(1) * 2);
            }
            v1Var.f27631d = i11;
            i10 = i11;
        }
        if (this.f27489c) {
            this.f27490d.getClass();
            return i10 + ((GeneratedMessageLite$ExtendableMessage) obj).extensions.f();
        }
        return i10;
    }

    @Override // com.google.protobuf.AbstractC2504f1
    public final AbstractC2497d0 g() {
        M0 m02 = this.f27487a;
        if (m02 instanceof AbstractC2497d0) {
            return ((AbstractC2497d0) m02).newMutableInstance();
        }
        return ((X) m02.newBuilderForType()).c();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ce A[EDGE_INSN: B:50:0x00ce->B:34:0x00ce ?: BREAK  , SYNTHETIC] */
    @Override // com.google.protobuf.AbstractC2504f1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(Object obj, byte[] bArr, int i10, int i11, com.google.android.gms.internal.play_billing.A a5) {
        Q0 q02 = this;
        AbstractC2497d0 abstractC2497d0 = (AbstractC2497d0) obj;
        v1 v1Var = abstractC2497d0.unknownFields;
        if (v1Var == v1.f27627f) {
            v1Var = new v1();
            abstractC2497d0.unknownFields = v1Var;
        }
        v1 v1Var2 = v1Var;
        S ensureExtensionsAreMutable = ((GeneratedMessageLite$ExtendableMessage) obj).ensureExtensionsAreMutable();
        int i12 = i10;
        C2491b0 c2491b0 = null;
        while (i12 < i11) {
            int L10 = AbstractC2508h.L(bArr, i12, a5);
            int i13 = a5.f26821a;
            M0 m02 = q02.f27487a;
            K k10 = q02.f27490d;
            int i14 = 2;
            Object obj2 = a5.f26824d;
            if (i13 != 11) {
                if ((i13 & 7) == 2) {
                    k10.getClass();
                    C2491b0 a10 = ((J) obj2).a(i13 >>> 3, m02);
                    if (a10 != null) {
                        i12 = AbstractC2508h.r(C2495c1.f27531c.a(a10.f27521c.getClass()), bArr, L10, i11, a5);
                        ensureExtensionsAreMutable.p(a10.f27522d, a5.f26823c);
                    } else {
                        i12 = AbstractC2508h.I(i13, bArr, L10, i11, v1Var2, a5);
                    }
                    c2491b0 = a10;
                } else {
                    i12 = AbstractC2508h.U(i13, bArr, L10, i11, a5);
                }
            } else {
                int i15 = 0;
                AbstractC2534q abstractC2534q = null;
                while (L10 < i11) {
                    L10 = AbstractC2508h.L(bArr, L10, a5);
                    int i16 = a5.f26821a;
                    int i17 = i16 >>> 3;
                    int i18 = i16 & 7;
                    if (i17 != i14) {
                        if (i17 == 3) {
                            if (c2491b0 != null) {
                                L10 = AbstractC2508h.r(C2495c1.f27531c.a(c2491b0.f27521c.getClass()), bArr, L10, i11, a5);
                                ensureExtensionsAreMutable.p(c2491b0.f27522d, a5.f26823c);
                            } else if (i18 == 2) {
                                L10 = AbstractC2508h.f(bArr, L10, a5);
                                abstractC2534q = (AbstractC2534q) a5.f26823c;
                            }
                            i14 = 2;
                        }
                        if (i16 != 12) {
                            break;
                        }
                        L10 = AbstractC2508h.U(i16, bArr, L10, i11, a5);
                        i14 = 2;
                    } else {
                        if (i18 == 0) {
                            L10 = AbstractC2508h.L(bArr, L10, a5);
                            i15 = a5.f26821a;
                            k10.getClass();
                            c2491b0 = ((J) obj2).a(i15, m02);
                            i14 = 2;
                        }
                        if (i16 != 12) {
                        }
                    }
                }
                if (abstractC2534q != null) {
                    v1Var2.f((i15 << 3) | 2, abstractC2534q);
                }
                q02 = this;
                i12 = L10;
            }
        }
        if (i12 == i11) {
            return;
        }
        throw C2540t0.f();
    }

    @Override // com.google.protobuf.AbstractC2504f1
    public final void i(Object obj, T0.m mVar, J j6) {
        this.f27488b.getClass();
        v1 a5 = w1.a(obj);
        K k10 = this.f27490d;
        k10.getClass();
        S ensureExtensionsAreMutable = ((GeneratedMessageLite$ExtendableMessage) obj).ensureExtensionsAreMutable();
        do {
            try {
                if (mVar.w() == Integer.MAX_VALUE) {
                    break;
                }
            } finally {
                ((AbstractC2497d0) obj).unknownFields = a5;
            }
        } while (k(mVar, j6, k10, ensureExtensionsAreMutable, a5));
    }

    @Override // com.google.protobuf.AbstractC2504f1
    public final void j(S4.o oVar, Object obj) {
        this.f27490d.getClass();
        Iterator l10 = ((GeneratedMessageLite$ExtendableMessage) obj).extensions.l();
        while (l10.hasNext()) {
            Map.Entry entry = (Map.Entry) l10.next();
            C2488a0 c2488a0 = (C2488a0) entry.getKey();
            if (c2488a0.f27516h0.f27433Y == O1.f27466o0 && !c2488a0.f27517i0 && !c2488a0.f27518j0) {
                Object value = entry.getValue();
                oVar.getClass();
                boolean z10 = value instanceof AbstractC2534q;
                int i10 = c2488a0.f27515Z;
                if (z10) {
                    ((AbstractC2549y) oVar.f16184Z).J0(i10, (AbstractC2534q) value);
                } else {
                    ((AbstractC2549y) oVar.f16184Z).I0(i10, (M0) value);
                }
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        this.f27488b.getClass();
        v1 v1Var = ((AbstractC2497d0) obj).unknownFields;
        v1Var.getClass();
        oVar.getClass();
        for (int i11 = 0; i11 < v1Var.f27628a; i11++) {
            int i12 = v1Var.f27629b[i11] >>> 3;
            Object obj2 = v1Var.f27630c[i11];
            if (obj2 instanceof AbstractC2534q) {
                ((AbstractC2549y) oVar.f16184Z).J0(i12, (AbstractC2534q) obj2);
            } else {
                ((AbstractC2549y) oVar.f16184Z).I0(i12, (M0) obj2);
            }
        }
    }

    public final boolean k(T0.m mVar, J j6, K k10, S s10, v1 v1Var) {
        int tag = mVar.getTag();
        M0 m02 = this.f27487a;
        if (tag != 11) {
            if ((tag & 7) == 2) {
                C2491b0 a5 = j6.a(tag >>> 3, m02);
                if (a5 != null) {
                    s10.p(a5.f27522d, mVar.Z(a5.f27521c.getClass(), j6));
                    return true;
                }
                return w1.c(v1Var, mVar);
            }
            return mVar.g0();
        }
        C2491b0 c2491b0 = null;
        AbstractC2534q abstractC2534q = null;
        int i10 = 0;
        while (mVar.w() != Integer.MAX_VALUE) {
            int tag2 = mVar.getTag();
            if (tag2 == 16) {
                i10 = mVar.l();
                c2491b0 = j6.a(i10, m02);
            } else if (tag2 == 26) {
                if (c2491b0 != null) {
                    s10.p(c2491b0.f27522d, mVar.Z(c2491b0.f27521c.getClass(), j6));
                } else {
                    abstractC2534q = mVar.V();
                }
            } else if (!mVar.g0()) {
                break;
            }
        }
        if (mVar.getTag() == 12) {
            if (abstractC2534q != null) {
                if (c2491b0 != null) {
                    L0 newBuilderForType = c2491b0.f27521c.newBuilderForType();
                    AbstractC2543v U10 = abstractC2534q.U();
                    X x10 = (X) newBuilderForType;
                    x10.e(U10, j6);
                    s10.p(c2491b0.f27522d, x10.c());
                    U10.a(0);
                } else {
                    v1Var.f((i10 << 3) | 2, abstractC2534q);
                }
            }
            return true;
        }
        throw new IOException("Protocol message end-group tag did not match expected tag.");
    }
}
