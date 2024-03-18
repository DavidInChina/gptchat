package n0;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import r0.C5347k;
import r0.C5348l;

/* renamed from: n0.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4707f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f39586a;

    public /* synthetic */ C4707f(int i10) {
        this.f39586a = i10;
    }

    public static C5347k a(int i10, long j6) {
        ColorFilter colorFilter;
        if (Build.VERSION.SDK_INT >= 29) {
            colorFilter = C5348l.f44250a.a(j6, i10);
        } else {
            colorFilter = new PorterDuffColorFilter(androidx.compose.ui.graphics.a.s(j6), androidx.compose.ui.graphics.a.u(i10));
        }
        return new C5347k(j6, i10, colorFilter);
    }

    public final String toString() {
        switch (this.f39586a) {
            case 23:
                return "ReusedSlotId";
            default:
                return super.toString();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4707f(int i10, int i11) {
        this(0);
        this.f39586a = i10;
        switch (i10) {
            case 1:
                this(1);
                return;
            case 2:
                this(2);
                return;
            case 3:
                this(3);
                return;
            case 4:
                this(4);
                return;
            case 5:
                this(5);
                return;
            case 6:
                this(6);
                return;
            case 7:
                this(7);
                return;
            case 8:
                this(8);
                return;
            case 9:
                this(9);
                return;
            case 10:
                this(10);
                return;
            case 11:
                this(11);
                return;
            case 12:
                this(12);
                return;
            case 13:
                this(13);
                return;
            case 14:
                this(14);
                return;
            case 15:
                this(15);
                return;
            case 16:
                this(16);
                return;
            case 17:
                this(17);
                return;
            case 18:
                this(18);
                return;
            case 19:
                this(19);
                return;
            case 20:
                this(20);
                return;
            case 21:
                this(21);
                return;
            case 22:
                this(22);
                return;
            case 23:
            default:
                return;
            case 24:
                this(24);
                return;
            case 25:
                this(25);
                return;
            case 26:
                this(26);
                return;
            case 27:
                this(27);
                return;
            case 28:
                this(28);
                return;
            case 29:
                this(29);
                return;
        }
    }
}
