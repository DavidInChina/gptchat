package A;

import id.AbstractC3557B;
import java.io.File;
import wf.AbstractC6216a;

/* renamed from: A.n0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0033n0 extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f257Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f258Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0033n0(AbstractC6216a abstractC6216a, int i10) {
        super(0);
        this.f257Y = i10;
        this.f258Z = abstractC6216a;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f257Y;
        AbstractC6216a abstractC6216a = this.f258Z;
        switch (i10) {
            case 0:
                return abstractC6216a.mo122invoke();
            case 1:
                return abstractC6216a.mo122invoke();
            case 2:
                return abstractC6216a.mo122invoke();
            case 3:
                return abstractC6216a.mo122invoke();
            case 4:
                return abstractC6216a.mo122invoke();
            case 5:
                return abstractC6216a.mo122invoke();
            case 6:
                return abstractC6216a.mo122invoke();
            case 7:
                return abstractC6216a.mo122invoke();
            case 8:
                File file = (File) abstractC6216a.mo122invoke();
                AbstractC3557B.c0("<this>", file);
                String name = file.getName();
                AbstractC3557B.b0("getName(...)", name);
                if (AbstractC3557B.K(Lg.n.P2('.', name, ""), "preferences_pb")) {
                    return file;
                }
                throw new IllegalStateException(("File extension for file: " + file + " does not match required extension for Preferences file: preferences_pb").toString());
            case 9:
                return abstractC6216a.mo122invoke();
            case 10:
                return abstractC6216a.mo122invoke();
            case 11:
                return abstractC6216a.mo122invoke();
            case 12:
                mo122invoke();
                return yVar;
            case 13:
                mo122invoke();
                return yVar;
            case 14:
                mo122invoke();
                return yVar;
            case 15:
                mo122invoke();
                return yVar;
            case 16:
                mo122invoke();
                return yVar;
            case 17:
                mo122invoke();
                return yVar;
            case 18:
                mo122invoke();
                return yVar;
            case 19:
                mo122invoke();
                return yVar;
            case 20:
                mo122invoke();
                return yVar;
            case 21:
                mo122invoke();
                return yVar;
            case 22:
                mo122invoke();
                return yVar;
            case 23:
                mo122invoke();
                return yVar;
            case 24:
                mo122invoke();
                return yVar;
            case 25:
                mo122invoke();
                return yVar;
            case 26:
                mo122invoke();
                return yVar;
            case 27:
                mo122invoke();
                return yVar;
            case 28:
                mo122invoke();
                return yVar;
            default:
                mo122invoke();
                return yVar;
        }
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke  reason: collision with other method in class */
    public final void mo122invoke() {
        int i10 = this.f257Y;
        AbstractC6216a abstractC6216a = this.f258Z;
        switch (i10) {
            case 12:
                abstractC6216a.mo122invoke();
                return;
            case 13:
                abstractC6216a.mo122invoke();
                return;
            case 14:
                abstractC6216a.mo122invoke();
                return;
            case 15:
                abstractC6216a.mo122invoke();
                return;
            case 16:
                abstractC6216a.mo122invoke();
                return;
            case 17:
                abstractC6216a.mo122invoke();
                return;
            case 18:
                abstractC6216a.mo122invoke();
                return;
            case 19:
                abstractC6216a.mo122invoke();
                return;
            case 20:
                abstractC6216a.mo122invoke();
                return;
            case 21:
                abstractC6216a.mo122invoke();
                return;
            case 22:
                abstractC6216a.mo122invoke();
                return;
            case 23:
                abstractC6216a.mo122invoke();
                return;
            case 24:
                abstractC6216a.mo122invoke();
                return;
            case 25:
                abstractC6216a.mo122invoke();
                return;
            case 26:
                abstractC6216a.mo122invoke();
                return;
            case 27:
                abstractC6216a.mo122invoke();
                return;
            case 28:
                if (abstractC6216a == null) {
                    return;
                }
                abstractC6216a.mo122invoke();
                return;
            default:
                abstractC6216a.mo122invoke();
                return;
        }
    }
}
