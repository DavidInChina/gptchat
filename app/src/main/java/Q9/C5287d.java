package q9;

import Z.AbstractC1725n;
import Z.AbstractC1734s;
import java.util.List;
import jf.y;
import kotlin.jvm.internal.o;
import wf.n;

/* renamed from: q9.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5287d extends o implements n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ List f43991Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ boolean f43992Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ long f43993h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ long f43994i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ wf.o f43995j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ int f43996k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ int f43997l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5287d(List list, boolean z10, long j6, long j10, wf.o oVar, int i10, int i11) {
        super(2);
        this.f43991Y = list;
        this.f43992Z = z10;
        this.f43993h0 = j6;
        this.f43994i0 = j10;
        this.f43995j0 = oVar;
        this.f43996k0 = i10;
        this.f43997l0 = i11;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int p10 = AbstractC1734s.p(this.f43996k0 | 1);
        long j6 = this.f43994i0;
        wf.o oVar = this.f43995j0;
        AbstractC5288e.a(this.f43991Y, this.f43992Z, this.f43993h0, j6, oVar, (AbstractC1725n) obj, p10, this.f43997l0);
        return y.f36177a;
    }
}
