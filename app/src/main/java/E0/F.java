package E0;

import java.util.Map;
import w.C6077x;

/* loaded from: classes.dex */
public final class F implements O {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4003a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ O f4004b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ J f4005c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f4006d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ O f4007e;

    public /* synthetic */ F(O o10, J j6, int i10, O o11, int i11) {
        this.f4003a = i11;
        this.f4005c = j6;
        this.f4006d = i10;
        this.f4007e = o11;
        this.f4004b = o10;
    }

    @Override // E0.O
    public final Map a() {
        int i10 = this.f4003a;
        O o10 = this.f4004b;
        switch (i10) {
            case 0:
                return o10.a();
            default:
                return o10.a();
        }
    }

    @Override // E0.O
    public final void b() {
        int i10 = this.f4003a;
        O o10 = this.f4007e;
        int i11 = this.f4006d;
        J j6 = this.f4005c;
        switch (i10) {
            case 0:
                j6.f4016j0 = i11;
                o10.b();
                kf.s.S1(j6.f4023q0.entrySet(), new C6077x(29, j6));
                return;
            default:
                j6.f4015i0 = i11;
                o10.b();
                j6.c(j6.f4015i0);
                return;
        }
    }

    @Override // E0.O
    public final int getHeight() {
        int i10 = this.f4003a;
        O o10 = this.f4004b;
        switch (i10) {
            case 0:
                return o10.getHeight();
            default:
                return o10.getHeight();
        }
    }

    @Override // E0.O
    public final int getWidth() {
        int i10 = this.f4003a;
        O o10 = this.f4004b;
        switch (i10) {
            case 0:
                return o10.getWidth();
            default:
                return o10.getWidth();
        }
    }
}
