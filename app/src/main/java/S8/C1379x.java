package S8;

import Z.AbstractC1725n;
import Z.C1723m;
import androidx.compose.foundation.BorderModifierNodeElement;
import id.AbstractC3557B;
import jf.C3959i;
import l0.AbstractC4326r;
import y.AbstractC6463a;

/* renamed from: S8.x  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1379x extends kotlin.jvm.internal.o implements wf.o {

    /* renamed from: Z  reason: collision with root package name */
    public static final C1379x f16392Z = new C1379x(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C1379x f16393h0 = new C1379x(1);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f16394Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1379x(int i10) {
        super(3);
        this.f16394Y = i10;
    }

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C3959i c3959i;
        long c10;
        io.sentry.hints.i iVar = C1723m.f22654Y;
        switch (this.f16394Y) {
            case 0:
                A a5 = (A) obj;
                ((Number) obj3).intValue();
                AbstractC3557B.c0("infoPanelType", a5);
                Z.r rVar = (Z.r) ((AbstractC1725n) obj2);
                Object i10 = AbstractC6463a.i(rVar, -1998730632, -492369756);
                if (i10 == iVar) {
                    int ordinal = a5.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal != 2) {
                                if (ordinal != 3) {
                                    if (ordinal == 4) {
                                        c3959i = new C3959i(new r0.r(androidx.compose.ui.graphics.a.c(4294962874L)), new r0.r(androidx.compose.ui.graphics.a.c(4294964173L)));
                                    } else {
                                        throw new RuntimeException();
                                    }
                                } else {
                                    c3959i = new C3959i(new r0.r(androidx.compose.ui.graphics.a.c(4294297291L)), new r0.r(androidx.compose.ui.graphics.a.c(4294498266L)));
                                }
                            } else {
                                c3959i = new C3959i(new r0.r(androidx.compose.ui.graphics.a.c(4291028683L)), new r0.r(androidx.compose.ui.graphics.a.c(4292144602L)));
                            }
                        } else {
                            c3959i = new C3959i(new r0.r(androidx.compose.ui.graphics.a.c(4292270299L)), new r0.r(androidx.compose.ui.graphics.a.c(4293059557L)));
                        }
                    } else {
                        c3959i = new C3959i(new r0.r(androidx.compose.ui.graphics.a.c(4290304767L)), new r0.r(androidx.compose.ui.graphics.a.c(4291618303L)));
                    }
                    float f6 = 4;
                    i10 = androidx.compose.foundation.a.d(new BorderModifierNodeElement(1, new r0.N(((r0.r) c3959i.f36155Y).f44265a), K.f.a(f6)), ((r0.r) c3959i.f36156Z).f44265a, K.f.a(f6));
                    rVar.h0(i10);
                }
                rVar.t(false);
                AbstractC4326r abstractC4326r = (AbstractC4326r) i10;
                rVar.t(false);
                return abstractC4326r;
            default:
                A a10 = (A) obj;
                ((Number) obj3).intValue();
                AbstractC3557B.c0("infoPanelType", a10);
                Z.r rVar2 = (Z.r) ((AbstractC1725n) obj2);
                Object i11 = AbstractC6463a.i(rVar2, 818489191, -492369756);
                if (i11 == iVar) {
                    int ordinal2 = a10.ordinal();
                    if (ordinal2 != 0) {
                        if (ordinal2 != 1) {
                            if (ordinal2 != 2) {
                                if (ordinal2 != 3) {
                                    if (ordinal2 == 4) {
                                        c10 = androidx.compose.ui.graphics.a.c(4286931972L);
                                    } else {
                                        throw new RuntimeException();
                                    }
                                } else {
                                    c10 = androidx.compose.ui.graphics.a.c(4285668388L);
                                }
                            } else {
                                c10 = androidx.compose.ui.graphics.a.c(4279588644L);
                            }
                        } else {
                            c10 = androidx.compose.ui.graphics.a.c(4281875777L);
                        }
                    } else {
                        c10 = androidx.compose.ui.graphics.a.c(4278206597L);
                    }
                    i11 = new N0.E(c10, 0L, null, null, null, 16777214);
                    rVar2.h0(i11);
                }
                rVar2.t(false);
                N0.E e10 = (N0.E) i11;
                rVar2.t(false);
                return e10;
        }
    }
}
