package Q1;

import a1.C1915c;
import android.os.Handler;
import android.os.Looper;
import g.RunnableC3115h;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import w.C6060g;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: j  reason: collision with root package name */
    public static final Object f14325j = new Object();

    /* renamed from: k  reason: collision with root package name */
    public static volatile l f14326k;

    /* renamed from: a  reason: collision with root package name */
    public final ReentrantReadWriteLock f14327a;

    /* renamed from: c  reason: collision with root package name */
    public volatile int f14329c;

    /* renamed from: e  reason: collision with root package name */
    public final C1179g f14331e;

    /* renamed from: f  reason: collision with root package name */
    public final k f14332f;

    /* renamed from: h  reason: collision with root package name */
    public final int f14334h;

    /* renamed from: i  reason: collision with root package name */
    public final C1177e f14335i;

    /* renamed from: d  reason: collision with root package name */
    public final Handler f14330d = new Handler(Looper.getMainLooper());

    /* renamed from: b  reason: collision with root package name */
    public final C6060g f14328b = new C6060g(0);

    /* renamed from: g  reason: collision with root package name */
    public final C1915c f14333g = new C1915c(7);

    /* JADX WARN: Type inference failed for: r5v5, types: [F4.a, Q1.g] */
    public l(y yVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f14327a = reentrantReadWriteLock;
        this.f14329c = 3;
        this.f14332f = yVar.f14322a;
        int i10 = yVar.f14323b;
        this.f14334h = i10;
        this.f14335i = yVar.f14324c;
        ?? aVar = new F4.a(16, this);
        this.f14331e = aVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i10 == 0) {
            try {
                this.f14329c = 0;
            } catch (Throwable th2) {
                this.f14327a.writeLock().unlock();
                throw th2;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (b() == 0) {
            aVar.K();
        }
    }

    public static l a() {
        l lVar;
        boolean z10;
        synchronized (f14325j) {
            try {
                lVar = f14326k;
                if (lVar != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return lVar;
    }

    public static boolean c() {
        if (f14326k != null) {
            return true;
        }
        return false;
    }

    public final int b() {
        this.f14327a.readLock().lock();
        try {
            return this.f14329c;
        } finally {
            this.f14327a.readLock().unlock();
        }
    }

    public final void d() {
        boolean z10;
        if (this.f14334h == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (b() == 1) {
                return;
            }
            this.f14327a.writeLock().lock();
            try {
                if (this.f14329c == 0) {
                    return;
                }
                this.f14329c = 0;
                this.f14327a.writeLock().unlock();
                this.f14331e.K();
                return;
            } finally {
                this.f14327a.writeLock().unlock();
            }
        }
        throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
    }

    public final void e(Throwable th2) {
        ArrayList arrayList = new ArrayList();
        this.f14327a.writeLock().lock();
        try {
            this.f14329c = 2;
            arrayList.addAll(this.f14328b);
            this.f14328b.clear();
            this.f14327a.writeLock().unlock();
            this.f14330d.post(new RunnableC3115h(arrayList, this.f14329c, th2));
        } catch (Throwable th3) {
            this.f14327a.writeLock().unlock();
            throw th3;
        }
    }

    public final void f() {
        ArrayList arrayList = new ArrayList();
        this.f14327a.writeLock().lock();
        try {
            this.f14329c = 1;
            arrayList.addAll(this.f14328b);
            this.f14328b.clear();
            this.f14327a.writeLock().unlock();
            this.f14330d.post(new RunnableC3115h(this.f14329c, arrayList));
        } catch (Throwable th2) {
            this.f14327a.writeLock().unlock();
            throw th2;
        }
    }

    public final CharSequence g(int i10, int i11, CharSequence charSequence) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13 = true;
        if (b() == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (i10 >= 0) {
                if (i11 >= 0) {
                    if (i10 <= i11) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    R4.b.S("start should be <= than end", z11);
                    if (charSequence == null) {
                        return null;
                    }
                    if (i10 <= charSequence.length()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    R4.b.S("start should be < than charSequence length", z12);
                    if (i11 > charSequence.length()) {
                        z13 = false;
                    }
                    R4.b.S("end should be < than charSequence length", z13);
                    if (charSequence.length() != 0 && i10 != i11) {
                        return this.f14331e.L(charSequence, i10, i11, false);
                    }
                    return charSequence;
                }
                throw new IllegalArgumentException("end cannot be negative");
            }
            throw new IllegalArgumentException("start cannot be negative");
        }
        throw new IllegalStateException("Not initialized yet");
    }

    public final void h(j jVar) {
        R4.b.U(jVar, "initCallback cannot be null");
        this.f14327a.writeLock().lock();
        try {
            if (this.f14329c != 1 && this.f14329c != 2) {
                this.f14328b.add(jVar);
                this.f14327a.writeLock().unlock();
            }
            this.f14330d.post(new RunnableC3115h(jVar, this.f14329c));
            this.f14327a.writeLock().unlock();
        } catch (Throwable th2) {
            this.f14327a.writeLock().unlock();
            throw th2;
        }
    }
}
