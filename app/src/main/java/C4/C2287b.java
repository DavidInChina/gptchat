package c4;

import Ng.F;
import com.google.android.gms.internal.play_billing.N;
import d4.AbstractC2592a;
import d4.AbstractC2597f;
import d4.AbstractC2599h;
import d4.C2593b;
import java.util.Arrays;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wf.n;

/* renamed from: c4.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2287b extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public int f26239Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC2599h f26240Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC2597f f26241h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ long f26242i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ long f26243j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ AbstractC2592a[] f26244k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2287b(AbstractC2599h abstractC2599h, AbstractC2597f abstractC2597f, long j6, long j10, AbstractC2592a[] abstractC2592aArr, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f26240Z = abstractC2599h;
        this.f26241h0 = abstractC2597f;
        this.f26242i0 = j6;
        this.f26243j0 = j10;
        this.f26244k0 = abstractC2592aArr;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C2287b(this.f26240Z, this.f26241h0, this.f26242i0, this.f26243j0, this.f26244k0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2287b) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f26239Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            AbstractC2592a[] abstractC2592aArr = this.f26244k0;
            long j6 = this.f26242i0;
            long j10 = this.f26243j0;
            AbstractC2599h abstractC2599h = this.f26240Z;
            AbstractC2597f abstractC2597f = this.f26241h0;
            this.f26239Y = 1;
            if (((C2593b) abstractC2599h.a(abstractC2597f, j6, j10, (AbstractC2592a[]) Arrays.copyOf(abstractC2592aArr, abstractC2592aArr.length))).f27989b.invoke(this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return y.f36177a;
    }
}
