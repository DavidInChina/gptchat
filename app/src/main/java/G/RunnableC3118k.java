package g;

import D1.H;
import D1.Z;
import E2.N;
import E2.X;
import H0.C0714y;
import H1.C0718a;
import K4.C0822j;
import K4.G;
import V1.DialogInterface$OnCancelListenerC1475p;
import V1.K;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.media.MediaRecorder;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationUtils;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.work.Worker;
import c5.C2289a;
import c5.C2294f;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import id.AbstractC3557B;
import io.sentry.android.core.AbstractC3612c;
import java.io.File;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import lf.C4442g;
import n.AbstractC4698i;
import p5.EnumC5090b;
import q.A0;
import q.C5222m;
import u5.C5843c;

/* renamed from: g.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC3118k implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f30959Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Object f30960Z;

    public /* synthetic */ RunnableC3118k(int i10, Object obj) {
        this.f30959Y = i10;
        this.f30960Z = obj;
    }

    private void b() {
        Object obj;
        synchronized (((androidx.lifecycle.E) this.f30960Z).f25292a) {
            obj = ((androidx.lifecycle.E) this.f30960Z).f25297f;
            ((androidx.lifecycle.E) this.f30960Z).f25297f = androidx.lifecycle.E.f25291k;
        }
        ((androidx.lifecycle.E) this.f30960Z).i(obj);
    }

    public final C4442g a() {
        C4442g c4442g = new C4442g();
        Cursor l10 = ((x3.n) this.f30960Z).f48697a.l(new B3.a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"), null);
        while (l10.moveToNext()) {
            try {
                c4442g.add(Integer.valueOf(l10.getInt(0)));
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    Ad.l.S(l10, th2);
                    throw th3;
                }
            }
        }
        Ad.l.S(l10, null);
        C4442g K10 = R4.b.K(c4442g);
        if (!K10.f38329Y.isEmpty()) {
            if (((x3.n) this.f30960Z).f48704h != null) {
                B3.i iVar = ((x3.n) this.f30960Z).f48704h;
                if (iVar != null) {
                    iVar.w();
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
            } else {
                throw new IllegalStateException("Required value was null.".toString());
            }
        }
        return K10;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x017d  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        C5222m c5222m;
        int i10;
        Set set;
        Y8.g gVar;
        Throwable th2;
        String str;
        O5.c cVar;
        AtomicLong atomicLong;
        String str2;
        int i11 = 0;
        switch (this.f30959Y) {
            case 0:
                try {
                    AbstractActivityC3122o.i((AbstractActivityC3122o) this.f30960Z);
                    return;
                } catch (IllegalStateException e10) {
                    if (TextUtils.equals(e10.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        return;
                    }
                    throw e10;
                } catch (NullPointerException e11) {
                    if (!TextUtils.equals(e11.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e11;
                    }
                    return;
                }
            case 1:
                AbstractC4698i abstractC4698i = (AbstractC4698i) this.f30960Z;
                abstractC4698i.a(true);
                abstractC4698i.invalidateSelf();
                return;
            case 2:
                A0 a02 = (A0) this.f30960Z;
                a02.f43226s0 = null;
                a02.drawableStateChanged();
                return;
            case 3:
                ActionMenuView actionMenuView = ((Toolbar) this.f30960Z).f24598h0;
                if (actionMenuView != null && (c5222m = actionMenuView.f24505A0) != null) {
                    c5222m.l();
                    return;
                }
                return;
            case 4:
                C0714y c0714y = (C0714y) this.f30960Z;
                c0714y.removeCallbacks(this);
                MotionEvent motionEvent = c0714y.f7118o1;
                if (motionEvent != null) {
                    if (motionEvent.getToolType(0) == 3) {
                        i11 = 1;
                    }
                    int actionMasked = motionEvent.getActionMasked();
                    if (i11 != 0) {
                        if (actionMasked == 10 || actionMasked == 1) {
                            return;
                        }
                    } else if (actionMasked == 1) {
                        return;
                    }
                    if (actionMasked != 7 && actionMasked != 9) {
                        i10 = 2;
                    } else {
                        i10 = 7;
                    }
                    c0714y.z(motionEvent, i10, c0714y.f7120p1, false);
                    return;
                }
                return;
            case 5:
                H1.g gVar2 = (H1.g) this.f30960Z;
                if (gVar2.f7177t0) {
                    if (gVar2.f7175r0) {
                        gVar2.f7175r0 = false;
                        C0718a c0718a = gVar2.f7163Y;
                        c0718a.getClass();
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        c0718a.f7157e = currentAnimationTimeMillis;
                        c0718a.f7159g = -1L;
                        c0718a.f7158f = currentAnimationTimeMillis;
                        c0718a.f7160h = 0.5f;
                    }
                    C0718a c0718a2 = gVar2.f7163Y;
                    if ((c0718a2.f7159g > 0 && AnimationUtils.currentAnimationTimeMillis() > c0718a2.f7159g + c0718a2.f7161i) || !gVar2.f()) {
                        gVar2.f7177t0 = false;
                        return;
                    }
                    if (gVar2.f7176s0) {
                        gVar2.f7176s0 = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        gVar2.f7165h0.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (c0718a2.f7158f != 0) {
                        long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                        float a5 = c0718a2.a(currentAnimationTimeMillis2);
                        c0718a2.f7158f = currentAnimationTimeMillis2;
                        H1.h.b(gVar2.f7179v0, (int) (((float) (currentAnimationTimeMillis2 - c0718a2.f7158f)) * ((a5 * 4.0f) + ((-4.0f) * a5 * a5)) * c0718a2.f7156d));
                        View view = gVar2.f7165h0;
                        WeakHashMap weakHashMap = Z.f3247a;
                        H.m(view, this);
                        return;
                    }
                    throw new RuntimeException("Cannot compute scroll delta before calling start()");
                }
                return;
            case 6:
                ((L1.e) this.f30960Z).n(0);
                return;
            case 7:
                DialogInterface$OnCancelListenerC1475p dialogInterface$OnCancelListenerC1475p = (DialogInterface$OnCancelListenerC1475p) this.f30960Z;
                dialogInterface$OnCancelListenerC1475p.f18228d1.onDismiss(dialogInterface$OnCancelListenerC1475p.f18235l1);
                return;
            case 8:
                ((K) this.f30960Z).y(true);
                return;
            case 9:
                b();
                return;
            case 10:
                N n10 = (N) ((I2.l) this.f30960Z);
                X[] xArr = n10.f4211y0;
                int length = xArr.length;
                while (i11 < length) {
                    X x10 = xArr[i11];
                    x10.q(true);
                    B2.k kVar = x10.f4256h;
                    if (kVar != null) {
                        kVar.c(x10.f4253e);
                        x10.f4256h = null;
                        x10.f4255g = null;
                    }
                    i11++;
                }
                U3.u uVar = n10.f4203q0;
                L2.q qVar = (L2.q) uVar.f17493h0;
                if (qVar != null) {
                    qVar.release();
                    uVar.f17493h0 = null;
                }
                uVar.f17494i0 = null;
                return;
            case 11:
                ReentrantReadWriteLock.ReadLock readLock = ((x3.n) this.f30960Z).f48697a.f48757h.readLock();
                AbstractC3557B.b0("readWriteLock.readLock()", readLock);
                readLock.lock();
                try {
                    try {
                        try {
                        } finally {
                            readLock.unlock();
                            ((x3.n) this.f30960Z).getClass();
                        }
                    } catch (SQLiteException e12) {
                        AbstractC3612c.d("ROOM", "Cannot run invalidation tracker. Is the db closed?", e12);
                        set = kf.x.f37485Y;
                    }
                } catch (IllegalStateException e13) {
                    AbstractC3612c.d("ROOM", "Cannot run invalidation tracker. Is the db closed?", e13);
                    set = kf.x.f37485Y;
                }
                if (((x3.n) this.f30960Z).b() && ((x3.n) this.f30960Z).f48702f.compareAndSet(true, false) && !((x3.n) this.f30960Z).f48697a.g().getWritableDatabase().y0()) {
                    B3.b writableDatabase = ((x3.n) this.f30960Z).f48697a.g().getWritableDatabase();
                    writableDatabase.X();
                    try {
                        set = a();
                        writableDatabase.U();
                        if (!set.isEmpty()) {
                            x3.n nVar = (x3.n) this.f30960Z;
                            synchronized (nVar.f48706j) {
                                Iterator it = nVar.f48706j.iterator();
                                while (true) {
                                    s.e eVar = (s.e) it;
                                    if (eVar.hasNext()) {
                                        ((x3.m) ((Map.Entry) eVar.next()).getValue()).a(set);
                                    }
                                }
                            }
                            return;
                        }
                        return;
                    } finally {
                        writableDatabase.j0();
                    }
                }
                return;
            case 12:
                Object obj = this.f30960Z;
                try {
                    ((Worker) obj).f25518j0.j(((Worker) obj).f());
                    return;
                } catch (Throwable th3) {
                    ((Worker) obj).f25518j0.k(th3);
                    return;
                }
            case 13:
                K4.C c10 = (K4.C) this.f30960Z;
                c10.f9343d.f9399a = 0;
                c10.f9343d.f9405g = null;
                G g10 = c10.f9343d.f9404f;
                C0822j c0822j = K4.H.f9362k;
                ((U3.u) g10).S(K4.F.b(24, 6, c0822j));
                c10.a(c0822j);
                return;
            case 14:
                C2294f c2294f = ((C2289a) this.f30960Z).f26247a;
                c2294f.f26264r1.removeView(c2294f.f26261G1);
                return;
            case 15:
                try {
                    ((Runnable) this.f30960Z).run();
                    return;
                } catch (Exception e14) {
                    M3.H.N("Executor", "Background execution failure.", e14);
                    return;
                }
            case 16:
                v7.l lVar = (v7.l) this.f30960Z;
                lVar.f47317c = false;
                L1.e eVar2 = ((BottomSheetBehavior) lVar.f47316b).f27031M;
                if (eVar2 != null && eVar2.f()) {
                    lVar.b(lVar.f47318d);
                    return;
                }
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) lVar.f47316b;
                if (bottomSheetBehavior.f27030L == 2) {
                    bottomSheetBehavior.C(lVar.f47318d);
                    return;
                }
                return;
            case 17:
                CheckableImageButton checkableImageButton = ((TextInputLayout) this.f30960Z).f27297j0.f32801n0;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case 18:
                Y8.g gVar3 = (Y8.g) this.f30960Z;
                gVar3.a();
                for (String str3 : gVar3.f22129h) {
                    AtomicLong atomicLong2 = gVar3.f22123b;
                    Y8.e eVar3 = Y8.e.f22117Y;
                    AtomicReference atomicReference = gVar3.f22122a;
                    Y8.e eVar4 = Y8.e.f22118Z;
                    if (((Y8.e) atomicReference.getAndSet(eVar4)) != eVar4) {
                        W8.a aVar = gVar3.f22126e;
                        long j6 = aVar.j();
                        O5.c cVar2 = gVar3.f22128g;
                        if (cVar2 != null) {
                            AbstractC3557B.c0("host", str3);
                        }
                        try {
                            cVar = cVar2;
                            try {
                                Y8.b d10 = gVar3.f22125d.d(str3, Long.valueOf(gVar3.f22130i));
                                try {
                                    str = "host";
                                    try {
                                        if ((d10.f22111d.j() - d10.f22109b) + d10.f22108a + d10.f22110c >= 0) {
                                            try {
                                                long j10 = aVar.j() - j6;
                                                long j11 = gVar3.f22133l;
                                                if (j10 <= j11) {
                                                    try {
                                                        gVar3.f22127f.a(d10);
                                                        atomicReference.set(eVar3);
                                                        atomicLong2.set(aVar.j());
                                                        return;
                                                    } catch (Throwable th4) {
                                                        th2 = th4;
                                                        gVar = gVar3;
                                                        atomicLong = atomicLong2;
                                                        str2 = str3;
                                                        if (cVar != null) {
                                                            try {
                                                                AbstractC3557B.c0(str, str2);
                                                                P4.a.m0(cVar.f13398a, 5, EnumC5090b.f42739Z, new C5843c(str2, 19), th2, false, 48);
                                                            } catch (Throwable th5) {
                                                                atomicReference.set(eVar3);
                                                                atomicLong.set(aVar.j());
                                                                throw th5;
                                                            }
                                                        }
                                                        AtomicLong atomicLong3 = atomicLong;
                                                        atomicReference.set(eVar3);
                                                        atomicLong3.set(aVar.j());
                                                        gVar3 = gVar;
                                                    }
                                                } else {
                                                    StringBuilder sb2 = new StringBuilder("Ignoring response from ");
                                                    str2 = str3;
                                                    try {
                                                        sb2.append(str2);
                                                        sb2.append(" because the network latency (");
                                                        sb2.append(j10);
                                                        sb2.append(" ms) is longer than the required value (");
                                                        sb2.append(j11);
                                                        sb2.append(" ms");
                                                        throw new K0.e(sb2.toString(), 8);
                                                        break;
                                                    } catch (Throwable th6) {
                                                        th = th6;
                                                        th2 = th;
                                                        gVar = gVar3;
                                                        atomicLong = atomicLong2;
                                                        if (cVar != null) {
                                                        }
                                                        AtomicLong atomicLong32 = atomicLong;
                                                        atomicReference.set(eVar3);
                                                        atomicLong32.set(aVar.j());
                                                        gVar3 = gVar;
                                                    }
                                                }
                                            } catch (Throwable th7) {
                                                th = th7;
                                                str2 = str3;
                                            }
                                        } else {
                                            str2 = str3;
                                            try {
                                                StringBuilder sb3 = new StringBuilder("Invalid time ");
                                                try {
                                                    gVar = gVar3;
                                                    try {
                                                        atomicLong = atomicLong2;
                                                        try {
                                                            sb3.append((d10.f22111d.j() - d10.f22109b) + d10.f22108a + d10.f22110c);
                                                            sb3.append(" received from ");
                                                            sb3.append(str2);
                                                            throw new K0.e(sb3.toString(), 8);
                                                            break;
                                                        } catch (Throwable th8) {
                                                            th = th8;
                                                            th2 = th;
                                                            if (cVar != null) {
                                                            }
                                                            AtomicLong atomicLong322 = atomicLong;
                                                            atomicReference.set(eVar3);
                                                            atomicLong322.set(aVar.j());
                                                            gVar3 = gVar;
                                                        }
                                                    } catch (Throwable th9) {
                                                        th = th9;
                                                        atomicLong = atomicLong2;
                                                        th2 = th;
                                                        if (cVar != null) {
                                                        }
                                                        AtomicLong atomicLong3222 = atomicLong;
                                                        atomicReference.set(eVar3);
                                                        atomicLong3222.set(aVar.j());
                                                        gVar3 = gVar;
                                                    }
                                                } catch (Throwable th10) {
                                                    th = th10;
                                                    gVar = gVar3;
                                                }
                                            } catch (Throwable th11) {
                                                th = th11;
                                                gVar = gVar3;
                                            }
                                        }
                                    } catch (Throwable th12) {
                                        th = th12;
                                        gVar = gVar3;
                                        atomicLong = atomicLong2;
                                        str2 = str3;
                                    }
                                } catch (Throwable th13) {
                                    th = th13;
                                    gVar = gVar3;
                                    str = "host";
                                    str2 = str3;
                                }
                            } catch (Throwable th14) {
                                th = th14;
                                gVar = gVar3;
                                str = "host";
                                str2 = str3;
                                atomicLong = atomicLong2;
                                th2 = th;
                                if (cVar != null) {
                                }
                                AtomicLong atomicLong32222 = atomicLong;
                                atomicReference.set(eVar3);
                                atomicLong32222.set(aVar.j());
                                gVar3 = gVar;
                            }
                        } catch (Throwable th15) {
                            th = th15;
                            gVar = gVar3;
                            str = "host";
                            cVar = cVar2;
                        }
                    } else {
                        gVar = gVar3;
                    }
                    gVar3 = gVar;
                }
                return;
            case 19:
                Fc.g gVar4 = (Fc.g) this.f30960Z;
                Fc.h hVar = gVar4.f5212m0;
                if (hVar != null) {
                    MediaRecorder mediaRecorder = hVar.f5214Z;
                    int maxAmplitude = mediaRecorder.getMaxAmplitude();
                    int max = Math.max(hVar.f5216i0, maxAmplitude);
                    File file = hVar.f5213Y;
                    AbstractC3557B.c0("file", file);
                    Yg.p pVar = hVar.f5215h0;
                    AbstractC3557B.c0("startTime", pVar);
                    gVar4.f5212m0 = new Fc.h(file, mediaRecorder, pVar, max);
                    Ad.l.O0(gVar4.f5207h0, null, null, new Fc.e(gVar4, hVar, maxAmplitude, null), 3);
                    gVar4.f5210k0.postDelayed(this, 300L);
                    return;
                }
                return;
            default:
                be.e eVar5 = (be.e) this.f30960Z;
                ViewTreeObserver viewTreeObserver = eVar5.f25953Z.getViewTreeObserver();
                AbstractC3557B.b0("viewTreeObserver", viewTreeObserver);
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnDrawListener(eVar5);
                    return;
                }
                return;
        }
    }
}
