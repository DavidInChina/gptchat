package L;

import N.C1034s;
import Z.AbstractC1710f0;
import android.content.res.Configuration;
import g4.C3178f;
import g4.C3179g;
import g4.C3180h;
import gb.AbstractC3242t;
import h.C3277c;
import id.AbstractC3557B;
import id.C3556A;
import java.util.List;
import q0.C5254f;
import ta.AbstractC5690F;

/* renamed from: L.m  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0860m extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f10232Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC1710f0 f10233Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0860m(AbstractC1710f0 abstractC1710f0, int i10) {
        super(1);
        this.f10232Y = i10;
        this.f10233Z = abstractC1710f0;
    }

    public final void a(long j6) {
        int i10;
        Integer num;
        int i11 = this.f10232Y;
        AbstractC1710f0 abstractC1710f0 = this.f10233Z;
        switch (i11) {
            case 4:
                int i12 = (int) (j6 >> 32);
                float f6 = AbstractC5690F.f45817a;
                Integer num2 = (Integer) abstractC1710f0.getValue();
                if (num2 != null) {
                    i10 = num2.intValue();
                } else {
                    i10 = 0;
                }
                if (i12 > i10) {
                    num = Integer.valueOf(i12);
                } else {
                    num = (Integer) abstractC1710f0.getValue();
                }
                abstractC1710f0.setValue(num);
                return;
            default:
                abstractC1710f0.setValue(Float.valueOf((int) (j6 & 4294967295L)));
                return;
        }
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f10232Y;
        AbstractC1710f0 abstractC1710f0 = this.f10233Z;
        switch (i10) {
            case 0:
                abstractC1710f0.setValue((List) obj);
                return yVar;
            case 1:
                abstractC1710f0.setValue((C1034s) obj);
                return yVar;
            case 2:
                Configuration configuration = new Configuration((Configuration) obj);
                Z.O o10 = H0.Z.f6887a;
                abstractC1710f0.setValue(configuration);
                return yVar;
            case 3:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                switch (i10) {
                    case 3:
                        float f6 = AbstractC5690F.f45817a;
                        abstractC1710f0.setValue(bool);
                        break;
                    default:
                        abstractC1710f0.setValue(bool);
                        break;
                }
                return yVar;
            case 4:
                a(((Z0.k) obj).f22804a);
                return yVar;
            case 5:
                C3179g c3179g = (C3179g) obj;
                switch (i10) {
                    case 5:
                        AbstractC3557B.c0("it", c3179g);
                        float f10 = AbstractC3242t.f31514a;
                        abstractC1710f0.setValue(c3179g);
                        break;
                    default:
                        AbstractC3557B.c0("it", c3179g);
                        float f11 = ub.k.f46564a;
                        abstractC1710f0.setValue(c3179g);
                        break;
                }
                return yVar;
            case 6:
                C3180h c3180h = (C3180h) obj;
                switch (i10) {
                    case 6:
                        AbstractC3557B.c0("it", c3180h);
                        float f12 = AbstractC3242t.f31514a;
                        abstractC1710f0.setValue(c3180h);
                        break;
                    default:
                        AbstractC3557B.c0("it", c3180h);
                        float f13 = ub.k.f46564a;
                        abstractC1710f0.setValue(c3180h);
                        break;
                }
                return yVar;
            case 7:
                C3178f c3178f = (C3178f) obj;
                switch (i10) {
                    case 7:
                        AbstractC3557B.c0("it", c3178f);
                        float f14 = AbstractC3242t.f31514a;
                        abstractC1710f0.setValue(c3178f);
                        break;
                    default:
                        AbstractC3557B.c0("it", c3178f);
                        float f15 = ub.k.f46564a;
                        abstractC1710f0.setValue(c3178f);
                        break;
                }
                return yVar;
            case 8:
                T0.z zVar = (T0.z) obj;
                AbstractC3557B.c0("value", zVar);
                if (zVar.f16830a.f12512Y.length() <= 128) {
                    abstractC1710f0.setValue(zVar);
                }
                return yVar;
            case 9:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                switch (i10) {
                    case 3:
                        float f16 = AbstractC5690F.f45817a;
                        abstractC1710f0.setValue(bool2);
                        break;
                    default:
                        abstractC1710f0.setValue(bool2);
                        break;
                }
                return yVar;
            case 10:
                invoke((String) obj);
                return yVar;
            case 11:
                C3179g c3179g2 = (C3179g) obj;
                switch (i10) {
                    case 5:
                        AbstractC3557B.c0("it", c3179g2);
                        float f17 = AbstractC3242t.f31514a;
                        abstractC1710f0.setValue(c3179g2);
                        break;
                    default:
                        AbstractC3557B.c0("it", c3179g2);
                        float f18 = ub.k.f46564a;
                        abstractC1710f0.setValue(c3179g2);
                        break;
                }
                return yVar;
            case 12:
                C3180h c3180h2 = (C3180h) obj;
                switch (i10) {
                    case 6:
                        AbstractC3557B.c0("it", c3180h2);
                        float f19 = AbstractC3242t.f31514a;
                        abstractC1710f0.setValue(c3180h2);
                        break;
                    default:
                        AbstractC3557B.c0("it", c3180h2);
                        float f20 = ub.k.f46564a;
                        abstractC1710f0.setValue(c3180h2);
                        break;
                }
                return yVar;
            case 13:
                C3178f c3178f2 = (C3178f) obj;
                switch (i10) {
                    case 7:
                        AbstractC3557B.c0("it", c3178f2);
                        float f21 = AbstractC3242t.f31514a;
                        abstractC1710f0.setValue(c3178f2);
                        break;
                    default:
                        AbstractC3557B.c0("it", c3178f2);
                        float f22 = ub.k.f46564a;
                        abstractC1710f0.setValue(c3178f2);
                        break;
                }
                return yVar;
            case 14:
                Yg.r rVar = (Yg.r) obj;
                AbstractC3557B.c0("it", rVar);
                abstractC1710f0.setValue(rVar);
                return yVar;
            case 15:
                invoke((String) obj);
                return yVar;
            case 16:
                invoke((String) obj);
                return yVar;
            case 17:
                C3556A c3556a = (C3556A) obj;
                switch (i10) {
                    case 17:
                        AbstractC3557B.c0("it", c3556a);
                        abstractC1710f0.setValue(c3556a);
                        break;
                    default:
                        AbstractC3557B.c0("it", c3556a);
                        abstractC1710f0.setValue(c3556a);
                        break;
                }
                return yVar;
            case 18:
                C3556A c3556a2 = (C3556A) obj;
                switch (i10) {
                    case 17:
                        AbstractC3557B.c0("it", c3556a2);
                        abstractC1710f0.setValue(c3556a2);
                        break;
                    default:
                        AbstractC3557B.c0("it", c3556a2);
                        abstractC1710f0.setValue(c3556a2);
                        break;
                }
                return yVar;
            case 19:
                a(((Z0.k) obj).f22804a);
                return yVar;
            case 20:
                AbstractC3557B.c0("$this$DisposableEffect", (Z.N) obj);
                return new C3277c(11, abstractC1710f0);
            default:
                abstractC1710f0.setValue(new C5254f(((C5254f) obj).f43640a));
                return yVar;
        }
    }

    public final void invoke(String str) {
        int i10 = this.f10232Y;
        AbstractC1710f0 abstractC1710f0 = this.f10233Z;
        switch (i10) {
            case 10:
                AbstractC3557B.c0("it", str);
                i0.r rVar = sb.l.f45515a;
                abstractC1710f0.setValue(str);
                return;
            case 15:
                AbstractC3557B.c0("it", str);
                float f6 = Kb.q.f9624a;
                abstractC1710f0.setValue(str);
                return;
            default:
                AbstractC3557B.c0("it", str);
                abstractC1710f0.setValue(str);
                return;
        }
    }
}
