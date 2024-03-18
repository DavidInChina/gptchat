package eb;

import android.app.Application;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import u9.EnumC5869a;

/* renamed from: eb.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2829e implements u9.b {

    /* renamed from: a  reason: collision with root package name */
    public final Vibrator f29116a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f29117b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f29118c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f29119d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f29120e;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
        if (r0 != false) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C2829e(Application application) {
        boolean z10;
        boolean areAllPrimitivesSupported;
        boolean areAllPrimitivesSupported2;
        Vibrator z02 = L4.a.z0(application);
        this.f29116a = z02;
        int i10 = Build.VERSION.SDK_INT;
        boolean z11 = true;
        if (i10 >= 31) {
            areAllPrimitivesSupported2 = z02.areAllPrimitivesSupported(8);
            if (areAllPrimitivesSupported2) {
                z10 = true;
                this.f29117b = z10;
                if (i10 >= 31) {
                    areAllPrimitivesSupported = z02.areAllPrimitivesSupported(2);
                }
                z11 = false;
                this.f29118c = z11;
                this.f29119d = L4.a.w0(application);
            }
        }
        z10 = false;
        this.f29117b = z10;
        if (i10 >= 31) {
        }
        z11 = false;
        this.f29118c = z11;
        this.f29119d = L4.a.w0(application);
    }

    @Override // u9.b
    public final void a() {
        VibrationEffect.Composition startComposition;
        VibrationEffect.Composition addPrimitive;
        VibrationEffect compose;
        if (this.f29119d && Build.VERSION.SDK_INT >= 30 && this.f29120e) {
            startComposition = VibrationEffect.startComposition();
            addPrimitive = startComposition.addPrimitive(4, 0.7f, 250);
            compose = addPrimitive.compose();
            this.f29116a.vibrate(compose);
        }
    }

    @Override // u9.b
    public final void b() {
        VibrationEffect.Composition startComposition;
        VibrationEffect.Composition addPrimitive;
        VibrationEffect compose;
        if (this.f29119d && Build.VERSION.SDK_INT >= 30 && this.f29120e) {
            startComposition = VibrationEffect.startComposition();
            addPrimitive = startComposition.addPrimitive(1);
            compose = addPrimitive.compose();
            this.f29116a.vibrate(compose);
        }
    }

    @Override // u9.b
    public final void c(float f6) {
        VibrationEffect.Composition startComposition;
        VibrationEffect compose;
        if (this.f29119d && Build.VERSION.SDK_INT >= 30 && this.f29120e) {
            float f10 = (0.20000002f * f6) + 0.1f;
            startComposition = VibrationEffect.startComposition();
            if (!this.f29117b) {
                startComposition.addPrimitive(7, f10);
            } else {
                startComposition.addPrimitive(8, f10);
            }
            compose = startComposition.compose();
            this.f29116a.vibrate(compose);
        }
    }

    @Override // u9.b
    public final boolean d() {
        return this.f29119d;
    }

    @Override // u9.b
    public final void e(float f6) {
        VibrationEffect.Composition startComposition;
        VibrationEffect.Composition addPrimitive;
        VibrationEffect compose;
        if (this.f29119d && Build.VERSION.SDK_INT >= 30 && this.f29120e) {
            startComposition = VibrationEffect.startComposition();
            addPrimitive = startComposition.addPrimitive(7, (0.40000004f * f6) + 0.2f);
            compose = addPrimitive.compose();
            this.f29116a.vibrate(compose);
        }
    }

    @Override // u9.b
    public final void f() {
        VibrationEffect.Composition startComposition;
        VibrationEffect.Composition addPrimitive;
        VibrationEffect compose;
        if (this.f29119d && Build.VERSION.SDK_INT >= 30 && this.f29120e) {
            startComposition = VibrationEffect.startComposition();
            addPrimitive = startComposition.addPrimitive(7);
            compose = addPrimitive.compose();
            this.f29116a.vibrate(compose);
        }
    }

    @Override // u9.b
    public final void g() {
        VibrationEffect.Composition startComposition;
        VibrationEffect.Composition addPrimitive;
        VibrationEffect.Composition addPrimitive2;
        VibrationEffect.Composition addPrimitive3;
        VibrationEffect.Composition addPrimitive4;
        VibrationEffect compose;
        if (this.f29119d && Build.VERSION.SDK_INT >= 30 && this.f29120e) {
            startComposition = VibrationEffect.startComposition();
            addPrimitive = startComposition.addPrimitive(1, 0.7f);
            addPrimitive2 = addPrimitive.addPrimitive(1, 0.8f, 60);
            addPrimitive3 = addPrimitive2.addPrimitive(1, 1.0f, 60);
            addPrimitive4 = addPrimitive3.addPrimitive(1, 1.0f, 60);
            compose = addPrimitive4.compose();
            this.f29116a.vibrate(compose);
        }
    }

    @Override // u9.b
    public final void h(EnumC5869a enumC5869a) {
        VibrationEffect createPredefined;
        VibrationEffect createPredefined2;
        VibrationEffect.Composition startComposition;
        VibrationEffect.Composition addPrimitive;
        VibrationEffect compose;
        if (this.f29119d && Build.VERSION.SDK_INT >= 30 && this.f29120e) {
            int ordinal = enumC5869a.ordinal();
            Vibrator vibrator = this.f29116a;
            if (ordinal == 0) {
                createPredefined = VibrationEffect.createPredefined(5);
                vibrator.vibrate(createPredefined);
            } else if (ordinal == 1) {
                if (this.f29118c) {
                    startComposition = VibrationEffect.startComposition();
                    addPrimitive = startComposition.addPrimitive(2);
                    compose = addPrimitive.compose();
                    vibrator.vibrate(compose);
                    return;
                }
                createPredefined2 = VibrationEffect.createPredefined(1);
                vibrator.vibrate(createPredefined2);
            }
        }
    }

    @Override // u9.b
    public final void setEnabled(boolean z10) {
        this.f29120e = z10;
    }
}
