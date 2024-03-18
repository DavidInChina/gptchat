package Ce;

import De.i;
import De.j;
import Qg.AbstractC1207j;
import com.google.android.gms.internal.play_billing.N;
import io.ktor.utils.io.x;
import java.nio.charset.Charset;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;

/* loaded from: classes.dex */
public final class c implements AbstractC1207j {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f3081Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC1207j f3082Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Charset f3083h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Je.a f3084i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ x f3085j0;

    public /* synthetic */ c(AbstractC1207j abstractC1207j, Charset charset, Je.a aVar, x xVar, int i10) {
        this.f3081Y = i10;
        this.f3082Z = abstractC1207j;
        this.f3083h0 = charset;
        this.f3084i0 = aVar;
        this.f3085j0 = xVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
        if (r15 == r10) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a6, code lost:
        if (r15 == r10) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    @Override // Qg.AbstractC1207j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, AbstractC4825e abstractC4825e) {
        b bVar;
        Object obj2;
        EnumC5000a enumC5000a;
        int i10;
        De.b bVar2;
        Object obj3;
        EnumC5000a enumC5000a2;
        int i11;
        y yVar = y.f36177a;
        int i12 = this.f3081Y;
        x xVar = this.f3085j0;
        Je.a aVar = this.f3084i0;
        Charset charset = this.f3083h0;
        AbstractC1207j abstractC1207j = this.f3082Z;
        switch (i12) {
            case 0:
                if (abstractC4825e instanceof b) {
                    bVar = (b) abstractC4825e;
                    int i13 = bVar.f3078Z;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        bVar.f3078Z = i13 - Integer.MIN_VALUE;
                        obj2 = bVar.f3077Y;
                        enumC5000a = EnumC5000a.f41328Y;
                        i10 = bVar.f3078Z;
                        if (i10 == 0) {
                            if (i10 != 1) {
                                if (i10 == 2) {
                                    N.B0(obj2);
                                    return yVar;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            abstractC1207j = bVar.f3079h0;
                            N.B0(obj2);
                        } else {
                            N.B0(obj2);
                            bVar.f3079h0 = abstractC1207j;
                            bVar.f3078Z = 1;
                            obj2 = ((i) obj).a(charset, aVar, xVar, bVar);
                            break;
                        }
                        bVar.f3079h0 = null;
                        bVar.f3078Z = 2;
                        if (abstractC1207j.c(obj2, bVar) != enumC5000a) {
                            return yVar;
                        }
                        return enumC5000a;
                    }
                }
                bVar = new b(this, abstractC4825e);
                obj2 = bVar.f3077Y;
                enumC5000a = EnumC5000a.f41328Y;
                i10 = bVar.f3078Z;
                if (i10 == 0) {
                }
                bVar.f3079h0 = null;
                bVar.f3078Z = 2;
                if (abstractC1207j.c(obj2, bVar) != enumC5000a) {
                }
                return enumC5000a;
            default:
                if (abstractC4825e instanceof De.b) {
                    bVar2 = (De.b) abstractC4825e;
                    int i14 = bVar2.f3586Z;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        bVar2.f3586Z = i14 - Integer.MIN_VALUE;
                        obj3 = bVar2.f3585Y;
                        enumC5000a2 = EnumC5000a.f41328Y;
                        i11 = bVar2.f3586Z;
                        if (i11 == 0) {
                            if (i11 != 1) {
                                if (i11 == 2) {
                                    N.B0(obj3);
                                    return yVar;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            abstractC1207j = bVar2.f3587h0;
                            N.B0(obj3);
                        } else {
                            N.B0(obj3);
                            bVar2.f3587h0 = abstractC1207j;
                            bVar2.f3586Z = 1;
                            obj3 = ((Ee.i) ((j) obj)).b(charset, aVar, xVar, bVar2);
                            break;
                        }
                        bVar2.f3587h0 = null;
                        bVar2.f3586Z = 2;
                        if (abstractC1207j.c(obj3, bVar2) != enumC5000a2) {
                            return yVar;
                        }
                        return enumC5000a2;
                    }
                }
                bVar2 = new De.b(this, abstractC4825e);
                obj3 = bVar2.f3585Y;
                enumC5000a2 = EnumC5000a.f41328Y;
                i11 = bVar2.f3586Z;
                if (i11 == 0) {
                }
                bVar2.f3587h0 = null;
                bVar2.f3586Z = 2;
                if (abstractC1207j.c(obj3, bVar2) != enumC5000a2) {
                }
                return enumC5000a2;
        }
    }
}
