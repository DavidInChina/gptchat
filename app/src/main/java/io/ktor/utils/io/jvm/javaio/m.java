package io.ktor.utils.io.jvm.javaio;

import com.google.android.gms.internal.play_billing.N;
import io.ktor.utils.io.B;
import io.ktor.utils.io.t;
import io.ktor.utils.io.u;
import java.io.InputStream;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class m extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public byte[] f33510Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f33511Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f33512h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Oe.g f33513i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ InputStream f33514j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Oe.g gVar, InputStream inputStream, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f33513i0 = gVar;
        this.f33514j0 = inputStream;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        m mVar = new m(this.f33513i0, this.f33514j0, abstractC4825e);
        mVar.f33512h0 = obj;
        return mVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((B) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        B b10;
        byte[] bArr;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f33511Z;
        InputStream inputStream = this.f33514j0;
        Oe.g gVar = this.f33513i0;
        if (i10 != 0) {
            if (i10 == 1) {
                bArr = this.f33510Y;
                b10 = (B) this.f33512h0;
                try {
                    N.B0(obj);
                } catch (Throwable th2) {
                    try {
                        ((t) b10.f33365Y).j(th2);
                        gVar.E0(bArr);
                        inputStream.close();
                        return y.f36177a;
                    } catch (Throwable th3) {
                        gVar.E0(bArr);
                        inputStream.close();
                        throw th3;
                    }
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            bArr = (byte[]) gVar.C();
            b10 = (B) this.f33512h0;
        }
        while (true) {
            int read = inputStream.read(bArr, 0, bArr.length);
            if (read >= 0) {
                if (read != 0) {
                    u uVar = b10.f33365Y;
                    this.f33512h0 = b10;
                    this.f33510Y = bArr;
                    this.f33511Z = 1;
                    if (((t) uVar).Y(bArr, read, this) == enumC5000a) {
                        return enumC5000a;
                    }
                }
            } else {
                gVar.E0(bArr);
                break;
            }
        }
    }
}
