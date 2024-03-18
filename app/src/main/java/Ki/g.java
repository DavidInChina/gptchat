package ki;

import java.io.IOException;
import jf.y;
import ji.AbstractC4137l;
import ji.C4116E;
import kotlin.jvm.internal.A;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.x;
import wf.n;

/* loaded from: classes.dex */
public final class g extends o implements n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ x f37615Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ long f37616Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ A f37617h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractC4137l f37618i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ A f37619j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ A f37620k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(x xVar, long j6, A a5, C4116E c4116e, A a10, A a11) {
        super(2);
        this.f37615Y = xVar;
        this.f37616Z = j6;
        this.f37617h0 = a5;
        this.f37618i0 = c4116e;
        this.f37619j0 = a10;
        this.f37620k0 = a11;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        long j6;
        int intValue = ((Number) obj).intValue();
        long longValue = ((Number) obj2).longValue();
        if (intValue == 1) {
            x xVar = this.f37615Y;
            if (!xVar.f37645Y) {
                xVar.f37645Y = true;
                if (longValue >= this.f37616Z) {
                    A a5 = this.f37617h0;
                    long j10 = a5.f37621Y;
                    int i10 = (j10 > 4294967295L ? 1 : (j10 == 4294967295L ? 0 : -1));
                    AbstractC4137l abstractC4137l = this.f37618i0;
                    if (i10 == 0) {
                        j10 = abstractC4137l.C0();
                    }
                    a5.f37621Y = j10;
                    A a10 = this.f37619j0;
                    long j11 = 0;
                    if (a10.f37621Y == 4294967295L) {
                        j6 = abstractC4137l.C0();
                    } else {
                        j6 = 0;
                    }
                    a10.f37621Y = j6;
                    A a11 = this.f37620k0;
                    if (a11.f37621Y == 4294967295L) {
                        j11 = abstractC4137l.C0();
                    }
                    a11.f37621Y = j11;
                } else {
                    throw new IOException("bad zip: zip64 extra too short");
                }
            } else {
                throw new IOException("bad zip: zip64 extra repeated");
            }
        }
        return y.f36177a;
    }
}
