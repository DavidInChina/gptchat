package L3;

import android.app.Notification;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final int f10718a;

    /* renamed from: b  reason: collision with root package name */
    public final int f10719b;

    /* renamed from: c  reason: collision with root package name */
    public final Notification f10720c;

    public i(int i10, int i11, Notification notification) {
        this.f10718a = i10;
        this.f10720c = notification;
        this.f10719b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f10718a != iVar.f10718a || this.f10719b != iVar.f10719b) {
            return false;
        }
        return this.f10720c.equals(iVar.f10720c);
    }

    public final int hashCode() {
        return this.f10720c.hashCode() + (((this.f10718a * 31) + this.f10719b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f10718a + ", mForegroundServiceType=" + this.f10719b + ", mNotification=" + this.f10720c + '}';
    }
}
