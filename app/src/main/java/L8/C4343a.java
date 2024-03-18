package l8;

import android.app.PendingIntent;
import java.util.HashMap;
import java.util.Map;

/* renamed from: l8.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4343a {

    /* renamed from: a  reason: collision with root package name */
    public final int f37847a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f37848b;

    /* renamed from: c  reason: collision with root package name */
    public final long f37849c;

    /* renamed from: d  reason: collision with root package name */
    public final long f37850d;

    /* renamed from: e  reason: collision with root package name */
    public final PendingIntent f37851e;

    /* renamed from: f  reason: collision with root package name */
    public final PendingIntent f37852f;

    /* renamed from: g  reason: collision with root package name */
    public final PendingIntent f37853g;

    /* renamed from: h  reason: collision with root package name */
    public final PendingIntent f37854h;

    /* renamed from: i  reason: collision with root package name */
    public final Map f37855i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f37856j = false;

    public C4343a(int i10, Integer num, long j6, long j10, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4, HashMap hashMap) {
        this.f37847a = i10;
        this.f37848b = num;
        this.f37849c = j6;
        this.f37850d = j10;
        this.f37851e = pendingIntent;
        this.f37852f = pendingIntent2;
        this.f37853g = pendingIntent3;
        this.f37854h = pendingIntent4;
    }

    public final PendingIntent a(C4352j c4352j) {
        long j6 = this.f37850d;
        long j10 = this.f37849c;
        boolean z10 = c4352j.f37885b;
        int i10 = c4352j.f37884a;
        if (i10 == 0) {
            PendingIntent pendingIntent = this.f37852f;
            if (pendingIntent != null) {
                return pendingIntent;
            }
            if (!z10 || j10 > j6) {
                return null;
            }
            return this.f37854h;
        }
        if (i10 == 1) {
            PendingIntent pendingIntent2 = this.f37851e;
            if (pendingIntent2 != null) {
                return pendingIntent2;
            }
            if (z10 && j10 <= j6) {
                return this.f37853g;
            }
        }
        return null;
    }
}
