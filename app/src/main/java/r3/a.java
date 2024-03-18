package R3;

import U3.q;
import android.os.Build;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class a extends d {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f15027b;

    /* renamed from: c  reason: collision with root package name */
    public final int f15028c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(S3.a aVar) {
        super(aVar);
        this.f15027b = 1;
        AbstractC3557B.c0("tracker", aVar);
        this.f15028c = 5;
    }

    @Override // R3.d
    public final int a() {
        return this.f15028c;
    }

    @Override // R3.d
    public final boolean b(q qVar) {
        switch (this.f15027b) {
            case 0:
                return qVar.f17459j.f10700b;
            case 1:
                return qVar.f17459j.f10702d;
            case 2:
                if (qVar.f17459j.f10699a == 2) {
                    return true;
                }
                return false;
            case 3:
                int i10 = qVar.f17459j.f10699a;
                if (i10 == 3) {
                    return true;
                }
                if (Build.VERSION.SDK_INT >= 30 && i10 == 6) {
                    return true;
                }
                return false;
            default:
                return qVar.f17459j.f10703e;
        }
    }

    @Override // R3.d
    public final boolean c(Object obj) {
        int i10 = this.f15027b;
        switch (i10) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                switch (i10) {
                    case 0:
                    case 1:
                    default:
                        return !booleanValue;
                }
            case 1:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                switch (i10) {
                    case 0:
                    case 1:
                    default:
                        return !booleanValue2;
                }
            case 2:
                return d((Q3.d) obj);
            case 3:
                return d((Q3.d) obj);
            default:
                boolean booleanValue3 = ((Boolean) obj).booleanValue();
                switch (i10) {
                    case 0:
                    case 1:
                    default:
                        return !booleanValue3;
                }
        }
    }

    public final boolean d(Q3.d dVar) {
        switch (this.f15027b) {
            case 2:
                AbstractC3557B.c0("value", dVar);
                int i10 = Build.VERSION.SDK_INT;
                boolean z10 = dVar.f14404a;
                if (i10 >= 26) {
                    if (!z10 || !dVar.f14405b) {
                        return true;
                    }
                } else if (!z10) {
                    return true;
                }
                return false;
            default:
                AbstractC3557B.c0("value", dVar);
                if (!dVar.f14404a || dVar.f14406c) {
                    return true;
                }
                return false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(S3.f fVar, int i10) {
        super(fVar);
        this.f15027b = i10;
        if (i10 == 2) {
            AbstractC3557B.c0("tracker", fVar);
            super(fVar);
            this.f15028c = 7;
        } else if (i10 == 3) {
            AbstractC3557B.c0("tracker", fVar);
            super(fVar);
            this.f15028c = 7;
        } else if (i10 != 4) {
            AbstractC3557B.c0("tracker", fVar);
            this.f15028c = 6;
        } else {
            AbstractC3557B.c0("tracker", fVar);
            super(fVar);
            this.f15028c = 9;
        }
    }
}
