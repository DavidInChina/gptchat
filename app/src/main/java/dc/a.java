package Dc;

import Jd.h;
import id.AbstractC3557B;
import kotlin.jvm.internal.o;
import wf.k;

/* loaded from: classes2.dex */
public final class a extends o implements k {

    /* renamed from: Z  reason: collision with root package name */
    public static final a f3488Z = new a(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final a f3489h0 = new a(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final a f3490i0 = new a(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final a f3491j0 = new a(3);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f3492Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i10) {
        super(1);
        this.f3492Y = i10;
    }

    public final h a(h hVar) {
        switch (this.f3492Y) {
            case 0:
                AbstractC3557B.c0("$this$setState", hVar);
                return h.e(hVar, true, false, 2);
            case 1:
                AbstractC3557B.c0("$this$setState", hVar);
                return h.e(hVar, false, false, 2);
            case 2:
                AbstractC3557B.c0("$this$setState", hVar);
                return h.e(hVar, false, true, 1);
            default:
                AbstractC3557B.c0("$this$setState", hVar);
                return h.e(hVar, false, false, 1);
        }
    }

    @Override // wf.k
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f3492Y) {
            case 0:
                return a((h) obj);
            case 1:
                return a((h) obj);
            case 2:
                return a((h) obj);
            default:
                return a((h) obj);
        }
    }
}
