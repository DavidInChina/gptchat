package hg;

import Bg.C0230x;
import Bg.Y;
import Bg.Z;
import Bg.d0;
import Bg.h0;
import Mf.b0;
import com.google.protobuf.AbstractC2515j0;
import com.google.protobuf.AbstractC2518k0;
import fg.e0;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import jh.EnumC4018h;
import jh.EnumC4030j1;
import jh.EnumC4060p1;
import jh.EnumC4073s0;
import jh.EnumC4077t;
import jh.EnumC4103y0;
import jh.EnumC4109z1;
import jh.F1;
import jh.P;
import jh.R0;
import jh.W;
import jh.Y0;
import kf.AbstractC4268D;
import kf.t;
import yf.AbstractC6583a;

/* renamed from: hg.j  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3431j implements Ag.h, AbstractC2518k0 {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f32341Y;

    public /* synthetic */ C3431j(int i10) {
        this.f32341Y = i10;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, hg.k] */
    public static C3432k c(e0 e0Var) {
        if (e0Var.f30575Z.size() == 0) {
            return C3432k.f32342a;
        }
        AbstractC3557B.b0("getRequirementList(...)", e0Var.f30575Z);
        return new Object();
    }

    @Override // com.google.protobuf.AbstractC2518k0
    public final AbstractC2515j0 a(int i10) {
        switch (this.f32341Y) {
            case 18:
                if (i10 != 0) {
                    if (i10 != 1) {
                        return null;
                    }
                    return EnumC4018h.JT_PUBLISHER;
                }
                return EnumC4018h.JT_ROOM;
            case 19:
                return EnumC4077t.b(i10);
            case 20:
                switch (i10) {
                    case 0:
                        return P.EGRESS_STARTING;
                    case 1:
                        return P.EGRESS_ACTIVE;
                    case 2:
                        return P.EGRESS_ENDING;
                    case 3:
                        return P.EGRESS_COMPLETE;
                    case 4:
                        return P.EGRESS_FAILED;
                    case 5:
                        return P.EGRESS_ABORTED;
                    case 6:
                        return P.EGRESS_LIMIT_REACHED;
                    default:
                        return null;
                }
            case 21:
                return W.b(i10);
            case 22:
                if (i10 != 0) {
                    if (i10 != 1) {
                        return null;
                    }
                    return EnumC4073s0.HLS_PROTOCOL;
                }
                return EnumC4073s0.DEFAULT_SEGMENTED_FILE_PROTOCOL;
            case 23:
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            return null;
                        }
                        return EnumC4103y0.FAILED;
                    }
                    return EnumC4103y0.FINISHED;
                }
                return EnumC4103y0.ACTIVE;
            case 24:
                if (i10 != 0) {
                    if (i10 != 1) {
                        return null;
                    }
                    return R0.OPUS_MONO_64KBS;
                }
                return R0.OPUS_STEREO_96KBPS;
            case 25:
                return Y0.b(i10);
            case 26:
                return EnumC4030j1.b(i10);
            case 27:
                return EnumC4060p1.b(i10);
            case 28:
                return EnumC4109z1.b(i10);
            default:
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                return null;
                            }
                            return F1.LOST;
                        }
                        return F1.EXCELLENT;
                    }
                    return F1.GOOD;
                }
                return F1.POOR;
        }
    }

    public final h0 b(Y y10, List list) {
        AbstractC3557B.c0("typeConstructor", y10);
        AbstractC3557B.c0("arguments", list);
        List parameters = y10.getParameters();
        AbstractC3557B.b0("getParameters(...)", parameters);
        b0 b0Var = (b0) t.p2(parameters);
        if (b0Var != null && b0Var.b0()) {
            List<b0> parameters2 = y10.getParameters();
            AbstractC3557B.b0("getParameters(...)", parameters2);
            ArrayList arrayList = new ArrayList(AbstractC6583a.H1(parameters2, 10));
            for (b0 b0Var2 : parameters2) {
                arrayList.add(b0Var2.f());
            }
            return new Z(AbstractC4268D.k1(t.S2(arrayList, list)), false);
        }
        return new C0230x((b0[]) parameters.toArray(new b0[0]), (d0[]) list.toArray(new d0[0]), false);
    }

    public final String toString() {
        switch (this.f32341Y) {
            case 14:
                return "NULL_VALUE";
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3431j(int i10, int i11) {
        this(0);
        this.f32341Y = i10;
        switch (i10) {
            case 1:
                this(1);
                return;
            case 2:
                this(2);
                return;
            case 3:
                this(3);
                return;
            case 4:
                this(4);
                return;
            case 5:
                this(5);
                return;
            case 6:
                this(6);
                return;
            case 7:
                this(7);
                return;
            case 8:
            case 14:
            default:
                return;
            case 9:
                this(9);
                return;
            case 10:
                this(10);
                return;
            case 11:
                this(11);
                return;
            case 12:
                this(12);
                return;
            case 13:
                this(13);
                return;
            case 15:
                this(15);
                return;
            case 16:
                this(16);
                return;
        }
    }
}
