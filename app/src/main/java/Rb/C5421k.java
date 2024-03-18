package rb;

import android.content.Intent;
import android.net.Uri;
import ca.C2325q;
import com.google.android.gms.internal.play_billing.N;
import fa.C2969F;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: rb.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5421k extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f44703Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f44704Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.n f44705h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C5436z f44706i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ C2325q f44707j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5421k(C2325q c2325q, C5436z c5436z, AbstractC4825e abstractC4825e, wf.n nVar) {
        super(2, abstractC4825e);
        this.f44705h0 = nVar;
        this.f44706i0 = c5436z;
        this.f44707j0 = c2325q;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C5421k c5421k = new C5421k(this.f44707j0, this.f44706i0, abstractC4825e, this.f44705h0);
        c5421k.f44704Z = obj;
        return c5421k;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C5421k) create((String) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f44703Y;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    N.B0(obj);
                    return (C2969F) obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            N.B0(obj);
        } else {
            N.B0(obj);
            Intent intent = new Intent("android.intent.action.DIAL");
            intent.setData(Uri.parse("tel:" + ((String) this.f44704Z)));
            this.f44703Y = 1;
            obj = this.f44705h0.invoke(intent, this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            this.f44703Y = 2;
            obj = C5436z.i(this.f44706i0, this.f44707j0, "Call started", 0, this, 12);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
            return (C2969F) obj;
        }
        return null;
    }
}
