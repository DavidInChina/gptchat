package q;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.PowerManager;
import android.util.SparseIntArray;

/* loaded from: classes.dex */
public final class r1 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f43543a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f43544b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f43545c;

    /* renamed from: d  reason: collision with root package name */
    public Object f43546d;

    /* renamed from: e  reason: collision with root package name */
    public Object f43547e;

    public final int a(int i10, int i11) {
        if (!this.f43545c) {
            return c(i10, i11);
        }
        int i12 = ((SparseIntArray) this.f43547e).get(i10, -1);
        if (i12 != -1) {
            return i12;
        }
        int c10 = c(i10, i11);
        ((SparseIntArray) this.f43547e).put(i10, c10);
        return c10;
    }

    public final int b(int i10, int i11) {
        if (!this.f43544b) {
            return i10 % i11;
        }
        int i12 = ((SparseIntArray) this.f43546d).get(i10, -1);
        if (i12 != -1) {
            return i12;
        }
        int i13 = i10 % i11;
        ((SparseIntArray) this.f43546d).put(i10, i13);
        return i13;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int c(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        if (this.f43545c) {
            SparseIntArray sparseIntArray = (SparseIntArray) this.f43547e;
            int size = sparseIntArray.size() - 1;
            int i16 = 0;
            while (i16 <= size) {
                int i17 = (i16 + size) >>> 1;
                if (sparseIntArray.keyAt(i17) < i10) {
                    i16 = i17 + 1;
                } else {
                    size = i17 - 1;
                }
            }
            int i18 = i16 - 1;
            if (i18 >= 0 && i18 < sparseIntArray.size()) {
                i15 = sparseIntArray.keyAt(i18);
            } else {
                i15 = -1;
            }
            if (i15 != -1) {
                i13 = ((SparseIntArray) this.f43547e).get(i15);
                i12 = i15 + 1;
                i14 = b(i15, i11) + 1;
                if (i14 == i11) {
                    i13++;
                    i14 = 0;
                }
                while (i12 < i10) {
                    i14++;
                    if (i14 == i11) {
                        i13++;
                        i14 = 0;
                    } else if (i14 > i11) {
                        i13++;
                        i14 = 1;
                    }
                    i12++;
                }
                if (i14 + 1 <= i11) {
                    return i13 + 1;
                }
                return i13;
            }
        }
        i14 = 0;
        i13 = 0;
        i12 = 0;
        while (i12 < i10) {
        }
        if (i14 + 1 <= i11) {
        }
    }

    public final void d() {
        ((SparseIntArray) this.f43546d).clear();
    }

    public final void e() {
        switch (this.f43543a) {
            case 1:
                this.f43544b = false;
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.f43547e;
                if (wakeLock != null) {
                    wakeLock.release();
                    return;
                }
                return;
            default:
                this.f43544b = false;
                WifiManager.WifiLock wifiLock = (WifiManager.WifiLock) this.f43547e;
                if (wifiLock != null) {
                    wifiLock.release();
                    return;
                }
                return;
        }
    }

    public final void f(boolean z10) {
        switch (this.f43543a) {
            case 1:
                this.f43545c = z10;
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.f43547e;
                if (wakeLock != null) {
                    if (this.f43544b && z10) {
                        wakeLock.acquire();
                        return;
                    } else {
                        wakeLock.release();
                        return;
                    }
                }
                return;
            default:
                this.f43545c = z10;
                WifiManager.WifiLock wifiLock = (WifiManager.WifiLock) this.f43547e;
                if (wifiLock != null) {
                    if (this.f43544b && z10) {
                        wifiLock.acquire();
                        return;
                    } else {
                        wifiLock.release();
                        return;
                    }
                }
                return;
        }
    }

    public r1(Context context, int i10) {
        this.f43543a = i10;
        if (i10 != 2) {
            this.f43546d = (PowerManager) context.getApplicationContext().getSystemService("power");
        } else {
            this.f43546d = (WifiManager) context.getApplicationContext().getSystemService("wifi");
        }
    }

    public r1() {
        this.f43543a = 4;
        this.f43546d = new SparseIntArray();
        this.f43547e = new SparseIntArray();
        this.f43544b = false;
        this.f43545c = false;
    }
}
