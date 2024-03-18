package Ua;

import Jc.AbstractC0810d;
import Ta.l;
import Vc.w;
import Vc.x;
import android.net.Uri;
import com.google.android.gms.internal.play_billing.N;
import f4.q;
import id.AbstractC3557B;
import jf.C3959i;
import k4.AbstractC4165g;
import nf.AbstractC4825e;
import of.EnumC5000a;
import q4.n;

/* loaded from: classes2.dex */
public final class g implements AbstractC4165g {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC0810d f17586a;

    /* renamed from: b  reason: collision with root package name */
    public final String f17587b;

    /* renamed from: c  reason: collision with root package name */
    public final n f17588c;

    /* renamed from: d  reason: collision with root package name */
    public final f4.i f17589d;

    public g(AbstractC0810d abstractC0810d, String str, n nVar, f4.i iVar) {
        AbstractC3557B.c0("fileServiceApi", abstractC0810d);
        AbstractC3557B.c0("options", nVar);
        AbstractC3557B.c0("imageLoader", iVar);
        this.f17586a = abstractC0810d;
        this.f17587b = str;
        this.f17588c = nVar;
        this.f17589d = iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008e A[RETURN] */
    @Override // k4.AbstractC4165g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(AbstractC4825e abstractC4825e) {
        f fVar;
        int i10;
        g gVar;
        x xVar;
        Uri uri;
        f4.i iVar;
        C3959i a5;
        if (abstractC4825e instanceof f) {
            fVar = (f) abstractC4825e;
            int i11 = fVar.f17585i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                fVar.f17585i0 = i11 - Integer.MIN_VALUE;
                Object obj = fVar.f17583Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = fVar.f17585i0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            N.B0(obj);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gVar = fVar.f17582Y;
                    N.B0(obj);
                } else {
                    N.B0(obj);
                    String v22 = Lg.n.v2("file-service://", this.f17587b);
                    fVar.f17582Y = this;
                    fVar.f17585i0 = 1;
                    obj = ((l) this.f17586a).a(v22, fVar);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    gVar = this;
                }
                xVar = (x) obj;
                if (xVar instanceof w) {
                    return null;
                }
                String str = ((Jc.g) ((w) xVar).f18565a).f9050b;
                if (str != null) {
                    uri = Uri.parse(str);
                } else {
                    uri = null;
                }
                if (uri == null || (a5 = ((q) iVar).f29639h.a(uri, gVar.f17588c, (iVar = gVar.f17589d), 0)) == null) {
                    return null;
                }
                fVar.f17582Y = null;
                fVar.f17585i0 = 2;
                obj = ((AbstractC4165g) a5.f36155Y).a(fVar);
                if (obj == enumC5000a) {
                    return enumC5000a;
                }
                return obj;
            }
        }
        fVar = new f(this, abstractC4825e);
        Object obj2 = fVar.f17583Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = fVar.f17585i0;
        if (i10 == 0) {
        }
        xVar = (x) obj2;
        if (xVar instanceof w) {
        }
    }
}
