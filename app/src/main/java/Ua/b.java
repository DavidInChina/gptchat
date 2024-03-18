package Ua;

import Df.H;
import Df.w;
import com.google.android.gms.internal.play_billing.N;
import he.C3418c;
import id.AbstractC3557B;
import io.ktor.utils.io.t;
import io.ktor.utils.io.x;
import jf.y;
import kotlin.jvm.internal.C;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import ve.AbstractC6034c;
import wf.n;

/* loaded from: classes2.dex */
public final class b extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public byte[] f17575Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f17576Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f17577h0;

    /* renamed from: i0  reason: collision with root package name */
    public /* synthetic */ Object f17578i0;

    /* JADX WARN: Type inference failed for: r0v0, types: [pf.j, Ua.b, nf.e] */
    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        ?? abstractC5163j = new AbstractC5163j(2, abstractC4825e);
        abstractC5163j.f17578i0 = obj;
        return abstractC5163j;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((AbstractC6034c) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0091  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x007d -> B:22:0x0080). Please submit an issue!!! */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        t tVar;
        byte[] bArr;
        int i10;
        int intValue;
        x xVar;
        AbstractC6034c abstractC6034c;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i11 = this.f17577h0;
        int i12 = 0;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    i10 = this.f17576Z;
                    bArr = this.f17575Y;
                    N.B0(obj);
                    tVar = (x) this.f17578i0;
                    intValue = ((Number) obj).intValue();
                    i10 += intValue;
                    if (intValue < 0) {
                        return new String(bArr, Lg.a.f11131a);
                    }
                    xVar = tVar;
                    this.f17578i0 = xVar;
                    this.f17575Y = bArr;
                    this.f17576Z = i10;
                    this.f17577h0 = 2;
                    t tVar2 = (t) xVar;
                    obj = tVar2.y(bArr, i10, 102400, this);
                    tVar = tVar2;
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    intValue = ((Number) obj).intValue();
                    i10 += intValue;
                    if (intValue < 0) {
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                i10 = this.f17576Z;
                abstractC6034c = (AbstractC6034c) this.f17578i0;
                N.B0(obj);
            }
        } else {
            N.B0(obj);
            AbstractC6034c abstractC6034c2 = (AbstractC6034c) this.f17578i0;
            C3418c b10 = abstractC6034c2.b();
            w a5 = C.a(x.class);
            Je.a n22 = R4.b.n2(H.O(a5), C.f37623a.b(x.class), a5);
            this.f17578i0 = abstractC6034c2;
            this.f17576Z = 0;
            this.f17577h0 = 1;
            Object a10 = b10.a(n22, this);
            if (a10 == enumC5000a) {
                return enumC5000a;
            }
            abstractC6034c = abstractC6034c2;
            obj = a10;
            i10 = 0;
        }
        if (obj != null) {
            xVar = (x) obj;
            Long j02 = AbstractC3557B.j0(abstractC6034c);
            if (j02 != null) {
                i12 = (int) j02.longValue();
            }
            bArr = new byte[i12];
            this.f17578i0 = xVar;
            this.f17575Y = bArr;
            this.f17576Z = i10;
            this.f17577h0 = 2;
            t tVar22 = (t) xVar;
            obj = tVar22.y(bArr, i10, 102400, this);
            tVar = tVar22;
            if (obj == enumC5000a) {
            }
            intValue = ((Number) obj).intValue();
            i10 += intValue;
            if (intValue < 0) {
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type io.ktor.utils.io.ByteReadChannel");
        }
    }
}
