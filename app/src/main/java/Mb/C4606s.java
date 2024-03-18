package mb;

import android.gov.nist.javax.sip.header.SIPHeaderNames;
import com.google.android.gms.internal.play_billing.N;
import java.util.LinkedHashMap;
import java.util.List;
import jf.C3959i;
import kf.AbstractC4268D;
import nd.C4812a;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import xe.AbstractC6435x;

/* renamed from: mb.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4606s extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public String f39092Y;

    /* renamed from: Z  reason: collision with root package name */
    public C3959i[] f39093Z;

    /* renamed from: h0  reason: collision with root package name */
    public C3959i[] f39094h0;

    /* renamed from: i0  reason: collision with root package name */
    public String f39095i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f39096j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ C4607t f39097k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ C4812a f39098l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4606s(C4607t c4607t, C4812a c4812a, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f39097k0 = c4607t;
        this.f39098l0 = c4812a;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C4606s(this.f39097k0, this.f39098l0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4606s) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0095  */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C3959i[] c3959iArr;
        C3959i[] c3959iArr2;
        String str;
        C4812a c4812a;
        Object obj2;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f39096j0;
        C4607t c4607t = this.f39097k0;
        String str2 = null;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    str = this.f39095i0;
                    c3959iArr2 = this.f39094h0;
                    c3959iArr = this.f39093Z;
                    str2 = this.f39092Y;
                    N.B0(obj);
                    c3959iArr2[0] = new C3959i(str, "Bearer " + obj);
                    List list = AbstractC6435x.f49956a;
                    c3959iArr[1] = new C3959i("Cookie", R.a.r("_playintegrity=", str2));
                    LinkedHashMap c12 = AbstractC4268D.c1(c3959iArr);
                    c4812a = this.f39098l0;
                    if (c4812a.f40280g) {
                        c12.put("ChatGPT-Account-ID", c4812a.f40276c);
                    }
                    return AbstractC4268D.l1(c12);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            N.B0(obj);
            nd.m mVar = (nd.m) obj;
            if (mVar != null) {
                obj2 = mVar.f40292a;
            } else {
                obj2 = null;
            }
        } else {
            N.B0(obj);
            Kc.b bVar = c4607t.f39100b;
            this.f39096j0 = 1;
            obj2 = ((Lc.s) bVar).c(false, this);
            if (obj2 == enumC5000a) {
                return enumC5000a;
            }
        }
        String str3 = (String) obj2;
        if (str3 != null) {
            str2 = str3;
        }
        if (str2 != null) {
            c3959iArr2 = new C3959i[2];
            List list2 = AbstractC6435x.f49956a;
            nd.l lVar = c4607t.f39099a;
            this.f39092Y = str2;
            this.f39093Z = c3959iArr2;
            this.f39094h0 = c3959iArr2;
            this.f39095i0 = SIPHeaderNames.AUTHORIZATION;
            this.f39096j0 = 2;
            obj = ((C9.l) lVar).h(this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
            str = SIPHeaderNames.AUTHORIZATION;
            c3959iArr = c3959iArr2;
            c3959iArr2[0] = new C3959i(str, "Bearer " + obj);
            List list3 = AbstractC6435x.f49956a;
            c3959iArr[1] = new C3959i("Cookie", R.a.r("_playintegrity=", str2));
            LinkedHashMap c122 = AbstractC4268D.c1(c3959iArr);
            c4812a = this.f39098l0;
            if (c4812a.f40280g) {
            }
            return AbstractC4268D.l1(c122);
        }
        throw new IllegalArgumentException("Must be authenticated".toString());
    }
}
