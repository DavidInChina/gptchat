package Ee;

import Lg.n;
import Qg.AbstractC1207j;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import io.ktor.utils.io.t;
import io.ktor.utils.io.z;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import jf.y;
import kotlinx.serialization.KSerializer;
import nf.AbstractC4825e;
import of.EnumC5000a;

/* loaded from: classes2.dex */
public final class f implements AbstractC1207j {

    /* renamed from: Y  reason: collision with root package name */
    public int f4708Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ z f4709Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ a f4710h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ i f4711i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ KSerializer f4712j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ Charset f4713k0;

    public f(z zVar, a aVar, i iVar, KSerializer kSerializer, Charset charset) {
        this.f4709Z = zVar;
        this.f4710h0 = aVar;
        this.f4711i0 = iVar;
        this.f4712j0 = kSerializer;
        this.f4713k0 = charset;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009c A[RETURN] */
    @Override // Qg.AbstractC1207j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, AbstractC4825e abstractC4825e) {
        e eVar;
        EnumC5000a enumC5000a;
        int i10;
        f fVar;
        Object obj2;
        Charset charset;
        Charset charset2;
        byte[] bArr;
        f fVar2;
        if (abstractC4825e instanceof e) {
            eVar = (e) abstractC4825e;
            int i11 = eVar.f4704Z;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                eVar.f4704Z = i11 - Integer.MIN_VALUE;
                Object obj3 = eVar.f4703Y;
                enumC5000a = EnumC5000a.f41328Y;
                i10 = eVar.f4704Z;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            fVar = eVar.f4706i0;
                            N.B0(obj3);
                            ((t) fVar.f4709Z).o(1);
                            return y.f36177a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = eVar.f4707j0;
                    fVar2 = eVar.f4706i0;
                    N.B0(obj3);
                } else {
                    N.B0(obj3);
                    int i12 = this.f4708Y;
                    this.f4708Y = i12 + 1;
                    if (i12 >= 0) {
                        if (i12 > 0) {
                            byte[] bArr2 = this.f4710h0.f4696c;
                            eVar.f4706i0 = this;
                            eVar.f4707j0 = obj;
                            eVar.f4704Z = 1;
                            if (P4.a.T0(this.f4709Z, bArr2, eVar) == enumC5000a) {
                                return enumC5000a;
                            }
                            fVar2 = this;
                        } else {
                            obj2 = obj;
                            fVar = this;
                            String d10 = fVar.f4711i0.f4729a.d(fVar.f4712j0, obj2);
                            charset = Lg.a.f11131a;
                            charset2 = fVar.f4713k0;
                            if (AbstractC3557B.K(charset2, charset)) {
                                bArr = n.b2(d10);
                            } else {
                                CharsetEncoder newEncoder = charset2.newEncoder();
                                AbstractC3557B.b0("charset.newEncoder()", newEncoder);
                                bArr = Le.a.c(newEncoder, d10, d10.length());
                            }
                            eVar.f4706i0 = fVar;
                            eVar.f4707j0 = null;
                            eVar.f4704Z = 2;
                            if (P4.a.T0(fVar.f4709Z, bArr, eVar) == enumC5000a) {
                                return enumC5000a;
                            }
                            ((t) fVar.f4709Z).o(1);
                            return y.f36177a;
                        }
                    } else {
                        throw new ArithmeticException("Index overflow has happened");
                    }
                }
                obj2 = obj;
                fVar = fVar2;
                String d102 = fVar.f4711i0.f4729a.d(fVar.f4712j0, obj2);
                charset = Lg.a.f11131a;
                charset2 = fVar.f4713k0;
                if (AbstractC3557B.K(charset2, charset)) {
                }
                eVar.f4706i0 = fVar;
                eVar.f4707j0 = null;
                eVar.f4704Z = 2;
                if (P4.a.T0(fVar.f4709Z, bArr, eVar) == enumC5000a) {
                }
                ((t) fVar.f4709Z).o(1);
                return y.f36177a;
            }
        }
        eVar = new e(this, abstractC4825e);
        Object obj32 = eVar.f4703Y;
        enumC5000a = EnumC5000a.f41328Y;
        i10 = eVar.f4704Z;
        if (i10 == 0) {
        }
        obj2 = obj;
        fVar = fVar2;
        String d1022 = fVar.f4711i0.f4729a.d(fVar.f4712j0, obj2);
        charset = Lg.a.f11131a;
        charset2 = fVar.f4713k0;
        if (AbstractC3557B.K(charset2, charset)) {
        }
        eVar.f4706i0 = fVar;
        eVar.f4707j0 = null;
        eVar.f4704Z = 2;
        if (P4.a.T0(fVar.f4709Z, bArr, eVar) == enumC5000a) {
        }
        ((t) fVar.f4709Z).o(1);
        return y.f36177a;
    }
}
