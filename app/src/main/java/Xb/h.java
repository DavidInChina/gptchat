package Xb;

import ac.AbstractC1971d;
import ac.C1970c;
import android.app.UiModeManager;
import android.content.Context;
import android.os.Build;
import com.openai.chatgpt.R;
import id.AbstractC3557B;
import jf.y;
import lc.AbstractC4411j;
import lc.C4408g;
import lc.C4409h;
import lc.C4410i;
import m.AbstractC4537q;
import nc.t;
import nc.u;
import nc.v;

/* loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f21822Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Context f21823Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Tc.f f21824h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Tc.f fVar, Context context, int i10) {
        super(1);
        this.f21822Y = i10;
        this.f21824h0 = fVar;
        this.f21823Z = context;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        y yVar = y.f36177a;
        int i10 = 0;
        int i11 = this.f21822Y;
        Context context = this.f21823Z;
        Tc.f fVar = this.f21824h0;
        switch (i11) {
            case 0:
                d dVar = (d) obj;
                AbstractC3557B.c0("effect", dVar);
                if (dVar instanceof c) {
                    K8.d.O0(context, fVar, ((c) dVar).f21819a);
                }
                return yVar;
            case 1:
                Yb.b bVar = (Yb.b) obj;
                AbstractC3557B.c0("effect", bVar);
                if (bVar instanceof Yb.a) {
                    K8.d.O0(context, fVar, ((Yb.a) bVar).f22209a);
                }
                return yVar;
            case 2:
                AbstractC1971d abstractC1971d = (AbstractC1971d) obj;
                AbstractC3557B.c0("effect", abstractC1971d);
                if (abstractC1971d instanceof C1970c) {
                    K8.d.O0(context, fVar, ((C1970c) abstractC1971d).f24148a);
                }
                return yVar;
            case 3:
                AbstractC4411j abstractC4411j = (AbstractC4411j) obj;
                AbstractC3557B.c0("effect", abstractC4411j);
                if (abstractC4411j instanceof C4409h) {
                    Bi.c.r1(fVar.f17057b, ((C4409h) abstractC4411j).f38262a);
                } else if (abstractC4411j instanceof C4408g) {
                    K8.d.O0(context, fVar, ((C4408g) abstractC4411j).f38261a);
                } else if (abstractC4411j instanceof C4410i) {
                    int i12 = 1;
                    if (Build.VERSION.SDK_INT >= 31) {
                        Object systemService = context.getSystemService("uimode");
                        AbstractC3557B.a0("null cannot be cast to non-null type android.app.UiModeManager", systemService);
                        UiModeManager uiModeManager = (UiModeManager) systemService;
                        zd.d dVar2 = ((C4410i) abstractC4411j).f38263a;
                        AbstractC3557B.c0("<this>", dVar2);
                        int ordinal = dVar2.ordinal();
                        if (ordinal != 0) {
                            if (ordinal != 1) {
                                if (ordinal == 2) {
                                    i10 = 2;
                                } else {
                                    throw new RuntimeException();
                                }
                            } else {
                                i10 = 1;
                            }
                        }
                        uiModeManager.setApplicationNightMode(i10);
                    } else {
                        zd.d dVar3 = ((C4410i) abstractC4411j).f38263a;
                        AbstractC3557B.c0("<this>", dVar3);
                        int ordinal2 = dVar3.ordinal();
                        if (ordinal2 != 0) {
                            if (ordinal2 != 1) {
                                if (ordinal2 == 2) {
                                    i12 = 2;
                                } else {
                                    throw new RuntimeException();
                                }
                            }
                        } else {
                            i12 = -1;
                        }
                        AbstractC4537q.k(i12);
                    }
                }
                return yVar;
            case 4:
                nc.l lVar = (nc.l) obj;
                AbstractC3557B.c0("effect", lVar);
                if (lVar instanceof nc.k) {
                    Tc.f.c(fVar, A7.b.G1(((nc.k) lVar).f40243a, fVar.f17059d, fVar.f17056a), 0, 14);
                } else if (lVar instanceof nc.j) {
                    K8.d.O0(context, fVar, ((nc.j) lVar).f40242a);
                } else if (lVar instanceof nc.i) {
                    String string = context.getString(R.string.share_screen_conversation_deleted);
                    AbstractC3557B.b0("getString(...)", string);
                    Tc.f.c(fVar, string, 0, 14);
                    fVar.f17057b.p();
                }
                return yVar;
            default:
                v vVar = (v) obj;
                AbstractC3557B.c0("effect", vVar);
                if (vVar instanceof u) {
                    Tc.f.c(fVar, A7.b.G1(((u) vVar).f40260a, fVar.f17059d, fVar.f17056a), 0, 14);
                } else if (vVar instanceof t) {
                    K8.d.O0(context, fVar, ((t) vVar).f40259a);
                }
                return yVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Context context, Tc.f fVar, int i10) {
        super(1);
        this.f21822Y = i10;
        this.f21823Z = context;
        this.f21824h0 = fVar;
    }
}
