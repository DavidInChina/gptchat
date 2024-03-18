package L;

import Cd.C0338x;
import Z.AbstractC1710f0;
import id.AbstractC3557B;
import q0.C5251c;
import wd.C6205s;

/* renamed from: L.s  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0871s extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f10286Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC1710f0 f10287Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.k f10288h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0871s(AbstractC1710f0 abstractC1710f0, wf.k kVar, int i10) {
        super(1);
        this.f10286Y = i10;
        this.f10287Z = abstractC1710f0;
        this.f10288h0 = kVar;
    }

    public final void a(long j6) {
        int i10 = this.f10286Y;
        wf.k kVar = this.f10288h0;
        AbstractC1710f0 abstractC1710f0 = this.f10287Z;
        switch (i10) {
            case 1:
                N0.C c10 = (N0.C) abstractC1710f0.getValue();
                if (c10 != null) {
                    kVar.invoke(Integer.valueOf(c10.m(j6)));
                    return;
                }
                return;
            case 2:
            default:
                x8.W.F(Pc.e.a(), "VoiceModeScreen onLongPress {true}", null, 6);
                abstractC1710f0.setValue(Boolean.TRUE);
                kVar.invoke(new C0338x(true));
                return;
            case 3:
                N0.C c11 = (N0.C) abstractC1710f0.getValue();
                if (c11 != null) {
                    kVar.invoke(Integer.valueOf(c11.m(j6)));
                    return;
                }
                return;
        }
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f10286Y;
        AbstractC1710f0 abstractC1710f0 = this.f10287Z;
        wf.k kVar = this.f10288h0;
        switch (i10) {
            case 0:
                N0.C c10 = (N0.C) obj;
                switch (i10) {
                    case 0:
                        abstractC1710f0.setValue(c10);
                        kVar.invoke(c10);
                        break;
                    default:
                        AbstractC3557B.c0("it", c10);
                        abstractC1710f0.setValue(c10);
                        kVar.invoke(c10);
                        break;
                }
                return yVar;
            case 1:
                a(((C5251c) obj).f43623a);
                return yVar;
            case 2:
                N0.C c11 = (N0.C) obj;
                switch (i10) {
                    case 0:
                        abstractC1710f0.setValue(c11);
                        kVar.invoke(c11);
                        break;
                    default:
                        AbstractC3557B.c0("it", c11);
                        abstractC1710f0.setValue(c11);
                        kVar.invoke(c11);
                        break;
                }
                return yVar;
            case 3:
                a(((C5251c) obj).f43623a);
                return yVar;
            case 4:
                long j6 = ((C5251c) obj).f43623a;
                N0.C c12 = (N0.C) abstractC1710f0.getValue();
                return Boolean.valueOf(c12 != null ? ((Boolean) kVar.invoke(Integer.valueOf(c12.m(j6)))).booleanValue() : false);
            case 5:
                invoke((String) obj);
                return yVar;
            case 6:
                invoke((String) obj);
                return yVar;
            case 7:
                C6205s c6205s = (C6205s) obj;
                AbstractC3557B.c0("account", c6205s);
                kVar.invoke(c6205s);
                abstractC1710f0.setValue(Boolean.FALSE);
                return yVar;
            case 8:
                invoke((String) obj);
                return yVar;
            default:
                a(((C5251c) obj).f43623a);
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0871s(wf.k kVar, AbstractC1710f0 abstractC1710f0, int i10) {
        super(1);
        this.f10286Y = i10;
        this.f10288h0 = kVar;
        this.f10287Z = abstractC1710f0;
    }

    public final void invoke(String str) {
        int i10 = this.f10286Y;
        AbstractC1710f0 abstractC1710f0 = this.f10287Z;
        wf.k kVar = this.f10288h0;
        switch (i10) {
            case 5:
                AbstractC3557B.c0("value", str);
                abstractC1710f0.setValue(str);
                kVar.invoke(str);
                return;
            case 6:
                AbstractC3557B.c0("newName", str);
                abstractC1710f0.setValue(Boolean.FALSE);
                kVar.invoke(str);
                return;
            default:
                AbstractC3557B.c0("newName", str);
                kVar.invoke(new nc.o(str));
                abstractC1710f0.setValue(Boolean.FALSE);
                return;
        }
    }
}
