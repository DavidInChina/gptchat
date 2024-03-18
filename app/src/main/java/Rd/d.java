package Rd;

import Ng.B;
import Ng.F;
import Pg.C;
import Pg.C1171d;
import Qd.A;
import Qd.q;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import jf.y;
import l8.AbstractC4344b;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wf.n;

/* loaded from: classes.dex */
public final class d extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public f f15423Y;

    /* renamed from: Z  reason: collision with root package name */
    public C f15424Z;

    /* renamed from: h0  reason: collision with root package name */
    public C1171d f15425h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f15426i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ f f15427j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f15427j0 = fVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new d(this.f15427j0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057 A[Catch: all -> 0x0018, TryCatch #1 {all -> 0x0018, blocks: (B:7:0x0012, B:13:0x0029, B:15:0x0034, B:16:0x003c, B:20:0x004e, B:22:0x0057, B:25:0x0091, B:26:0x00a4, B:28:0x00aa, B:30:0x00bb, B:33:0x00c7, B:36:0x00df, B:37:0x00f9, B:39:0x0102), top: B:48:0x0006, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00aa A[Catch: all -> 0x0018, TRY_LEAVE, TryCatch #1 {all -> 0x0018, blocks: (B:7:0x0012, B:13:0x0029, B:15:0x0034, B:16:0x003c, B:20:0x004e, B:22:0x0057, B:25:0x0091, B:26:0x00a4, B:28:0x00aa, B:30:0x00bb, B:33:0x00c7, B:36:0x00df, B:37:0x00f9, B:39:0x0102), top: B:48:0x0006, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0113  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x008e -> B:8:0x0015). Please submit an issue!!! */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Pg.k kVar;
        f fVar;
        C c10;
        C1171d c1171d;
        f fVar2;
        Object a5;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f15426i0;
        try {
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        c1171d = this.f15425h0;
                        C c11 = this.f15424Z;
                        fVar = this.f15423Y;
                        N.B0(obj);
                        kVar = c11;
                        fVar2 = fVar;
                        Qd.i iVar = fVar2.f15434a;
                        for (String str : R4.b.M1(iVar.h().b(5))) {
                            File file = new File(str);
                            if (file.exists()) {
                                try {
                                    q I10 = fVar2.f15440g.I(fVar2.f15437d);
                                    OutputStream outputStream = I10.f14638h0;
                                    if (outputStream != null) {
                                        io.sentry.instrumentation.file.d t10 = N.t(new FileInputStream(file), file);
                                        AbstractC3557B.o0(t10, outputStream);
                                        t10.close();
                                        outputStream.close();
                                        I10.close();
                                    }
                                    r.f.M(iVar, fVar2.f15435b + " uploaded " + str);
                                } catch (Exception e10) {
                                    AbstractC4344b.W0(iVar, e10);
                                    if (f.a(fVar2, e10, file)) {
                                    }
                                }
                                A h10 = iVar.h();
                                String path = file.getPath();
                                AbstractC3557B.b0("file.path", path);
                                h10.d(path);
                            }
                        }
                        this.f15423Y = fVar2;
                        this.f15424Z = kVar;
                        this.f15425h0 = c1171d;
                        this.f15426i0 = 1;
                        a5 = c1171d.a(this);
                        if (a5 == enumC5000a) {
                            return enumC5000a;
                        }
                        fVar = fVar2;
                        obj = a5;
                        c10 = kVar;
                        if (!((Boolean) obj).booleanValue()) {
                            String str2 = (String) c1171d.b();
                            Qd.i iVar2 = fVar.f15434a;
                            r.f.M(iVar2, fVar.f15435b + " performing flush");
                            B c12 = fVar.f15434a.f14611Z.c();
                            c cVar = new c(fVar, null);
                            this.f15423Y = fVar;
                            this.f15424Z = c10;
                            this.f15425h0 = c1171d;
                            this.f15426i0 = 2;
                            kVar = c10;
                            if (Ad.l.n1(this, c12, cVar) == enumC5000a) {
                                return enumC5000a;
                            }
                            fVar2 = fVar;
                            Qd.i iVar3 = fVar2.f15434a;
                            while (r6.hasNext()) {
                            }
                            this.f15423Y = fVar2;
                            this.f15424Z = kVar;
                            this.f15425h0 = c1171d;
                            this.f15426i0 = 1;
                            a5 = c1171d.a(this);
                            if (a5 == enumC5000a) {
                            }
                        } else {
                            R4.b.Q(c10, null);
                            return y.f36177a;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    c1171d = this.f15425h0;
                    C c13 = this.f15424Z;
                    fVar = this.f15423Y;
                    N.B0(obj);
                    c10 = c13;
                    if (!((Boolean) obj).booleanValue()) {
                    }
                }
            } else {
                N.B0(obj);
                fVar2 = this.f15427j0;
                kVar = fVar2.f15439f;
                kVar.getClass();
                c1171d = new C1171d(kVar);
                this.f15423Y = fVar2;
                this.f15424Z = kVar;
                this.f15425h0 = c1171d;
                this.f15426i0 = 1;
                a5 = c1171d.a(this);
                if (a5 == enumC5000a) {
                }
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                R4.b.Q(kVar, th2);
                throw th3;
            }
        }
    }
}
