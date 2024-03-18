package W;

import A.C0051x;
import Z.AbstractC1710f0;
import id.AbstractC3557B;
import java.util.LinkedHashMap;
import nf.AbstractC4828h;
import q0.C5254f;
import t0.AbstractC5646e;
import t0.AbstractC5648g;
import t0.C5644c;

/* renamed from: W.m2  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1584m2 extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f20224Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ float f20225Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f20226h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1584m2(float f6, int i10, Object obj) {
        super(1);
        this.f20224Y = i10;
        this.f20225Z = f6;
        this.f20226h0 = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d1, code lost:
        if (r15.containsKey(r2) != false) goto L23;
     */
    @Override // wf.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f20224Y;
        Object obj2 = this.f20226h0;
        float f6 = this.f20225Z;
        switch (i10) {
            case 0:
                C1550f3 c1550f3 = (C1550f3) obj2;
                C1579l2 c1579l2 = new C1579l2(f6, ((Z0.k) obj).f22804a, c1550f3);
                C1543e1 c1543e1 = new C1543e1();
                c1579l2.invoke(c1543e1);
                LinkedHashMap linkedHashMap = c1543e1.f20033a;
                F1 f12 = new F1(linkedHashMap);
                int ordinal = ((EnumC1555g3) c1550f3.f20062c.f18998g.getValue()).ordinal();
                EnumC1555g3 enumC1555g3 = EnumC1555g3.f20078Y;
                if (ordinal != 0) {
                    if (ordinal != 1 && ordinal != 2) {
                        throw new RuntimeException();
                    }
                    EnumC1555g3 enumC1555g32 = EnumC1555g3.f20080h0;
                    if (!linkedHashMap.containsKey(enumC1555g32)) {
                        enumC1555g32 = EnumC1555g3.f20079Z;
                        break;
                    }
                    enumC1555g3 = enumC1555g32;
                }
                C c10 = c1550f3.f20062c;
                if (!AbstractC3557B.K(c10.d(), f12)) {
                    c10.f19003l.setValue(f12);
                    B b10 = new B(c10, 0, enumC1555g3);
                    Wg.d dVar = c10.f18995d.f20564b;
                    boolean f10 = dVar.f(null);
                    if (f10) {
                        try {
                            b10.mo122invoke();
                        } finally {
                            dVar.g(null);
                        }
                    }
                    if (!f10) {
                        c10.i(enumC1555g3);
                    }
                }
                return yVar;
            case 1:
                long j6 = ((C5254f) obj).f43640a;
                float d10 = C5254f.d(j6) * f6;
                float b11 = C5254f.b(j6) * f6;
                AbstractC1710f0 abstractC1710f0 = (AbstractC1710f0) obj2;
                if (C5254f.d(((C5254f) abstractC1710f0.getValue()).f43640a) != d10 || C5254f.b(((C5254f) abstractC1710f0.getValue()).f43640a) != b11) {
                    abstractC1710f0.setValue(new C5254f(AbstractC4828h.i(d10, b11)));
                }
                return yVar;
            default:
                G0.J j10 = (G0.J) ((AbstractC5646e) obj);
                j10.a();
                if (!Z0.e.a(f6, 0.0f)) {
                    C5644c c5644c = j10.f5596Y;
                    float b12 = c5644c.b() * f6;
                    float b13 = C5254f.b(c5644c.g()) - (b12 / 2);
                    AbstractC5648g.f(j10, ((C0051x) obj2).f322b, R4.b.r(0.0f, b13), R4.b.r(C5254f.d(c5644c.g()), b13), b12, 0.0f, 496);
                }
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1584m2(C1550f3 c1550f3, float f6) {
        super(1);
        this.f20224Y = 0;
        this.f20226h0 = c1550f3;
        this.f20225Z = f6;
    }
}
