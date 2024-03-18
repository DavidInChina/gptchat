package Ii;

import ae.AbstractC1979e;
import ae.AbstractC1980f;
import ae.AbstractC1981g;
import ae.AbstractC1983i;
import android.content.res.Resources;
import android.gov.nist.core.Separators;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import f.AbstractC2929a;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import jf.C3963m;
import mh.C4679i;

/* renamed from: Ii.h  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0803h implements AbstractC1980f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.B f8651a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.z f8652b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.B f8653c;

    public C0803h(kotlin.jvm.internal.B b10, kotlin.jvm.internal.z zVar, kotlin.jvm.internal.B b11) {
        this.f8651a = b10;
        this.f8652b = zVar;
        this.f8653c = b11;
    }

    @Override // ae.AbstractC1980f
    public final void a(View view, boolean z10) {
        AbstractC3557B.c0("view", view);
        if (z10) {
            b(view);
        }
    }

    public final void b(View view) {
        AbstractC3557B.c0("view", view);
        final Window a5 = AbstractC1983i.a(view);
        if (a5 != null && AbstractC2929a.a(view) == 0) {
            CopyOnWriteArrayList b10 = AbstractC1983i.b(a5);
            final kotlin.jvm.internal.z zVar = this.f8652b;
            final kotlin.jvm.internal.B b11 = this.f8653c;
            final kotlin.jvm.internal.B b12 = this.f8651a;
            b10.add(new AbstractC1981g() { // from class: Ii.g
                /* JADX WARN: Code restructure failed: missing block: B:31:0x00ee, code lost:
                    if (r0 == ((android.view.MotionEvent) r14).getEventTime()) goto L33;
                 */
                @Override // ae.AbstractC1981g
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final AbstractC1979e a(MotionEvent motionEvent, wf.k kVar) {
                    boolean z10;
                    ViewGroup viewGroup;
                    String str;
                    String str2;
                    kotlin.jvm.internal.B b13 = kotlin.jvm.internal.B.this;
                    AbstractC3557B.c0("$touchDownWaitingRender", b13);
                    kotlin.jvm.internal.z zVar2 = zVar;
                    AbstractC3557B.c0("$repeatTouchDownCount", zVar2);
                    Window window = a5;
                    AbstractC3557B.c0("$window", window);
                    kotlin.jvm.internal.B b14 = b11;
                    AbstractC3557B.c0("$pressedViewName", b14);
                    AbstractC3557B.c0("motionEvent", motionEvent);
                    AbstractC3557B.c0("dispatch", kVar);
                    boolean z11 = true;
                    if (motionEvent.getAction() == 0) {
                        if (b13.f37622Y != null) {
                            zVar2.f37647Y++;
                        } else {
                            long uptimeMillis = SystemClock.uptimeMillis();
                            if (uptimeMillis - motionEvent.getEventTime() > 700) {
                                String obj = window.getAttributes().getTitle().toString();
                                String O22 = Lg.n.O2(obj, Separators.SLASH, obj);
                                b13.f37622Y = MotionEvent.obtain(motionEvent);
                                C4679i c4679i = new C4679i(b13, uptimeMillis, O22, zVar2, b14);
                                ArrayList arrayList = AbstractC0801f.f8646a;
                                C3963m c3963m = AbstractC0804i.f8654a;
                                if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                                    StackTraceElement[] stackTrace = new RuntimeException().getStackTrace();
                                    AbstractC3557B.b0("stackTrace", stackTrace);
                                    int l32 = kf.q.l3(stackTrace);
                                    if (l32 >= 0) {
                                        while (true) {
                                            int i10 = l32 - 1;
                                            StackTraceElement stackTraceElement = stackTrace[l32];
                                            if (AbstractC3557B.K(stackTraceElement.getClassName(), "android.view.Choreographer") && AbstractC3557B.K(stackTraceElement.getMethodName(), "doFrame")) {
                                                AbstractC0801f.a(c4679i);
                                                break;
                                            } else if (i10 < 0) {
                                                break;
                                            } else {
                                                l32 = i10;
                                            }
                                        }
                                    }
                                }
                                Choreographer.getInstance().postFrameCallback(new T0.E(2, c4679i));
                            }
                        }
                    }
                    AbstractC1979e abstractC1979e = (AbstractC1979e) kVar.invoke(motionEvent);
                    int action = motionEvent.getAction();
                    Object obj2 = b13.f37622Y;
                    if (obj2 != null && action == 0 && zVar2.f37647Y == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (obj2 != null && action == 1) {
                        long downTime = motionEvent.getDownTime();
                        Object obj3 = b13.f37622Y;
                        AbstractC3557B.Z(obj3);
                    }
                    z11 = false;
                    if (z10 || z11) {
                        View decorView = window.getDecorView();
                        View view2 = null;
                        if (decorView instanceof ViewGroup) {
                            viewGroup = (ViewGroup) decorView;
                        } else {
                            viewGroup = null;
                        }
                        if (viewGroup != null) {
                            view2 = r9.y.h0(viewGroup);
                        }
                        if (view2 != null) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append((Object) view2.getClass().getName());
                            sb2.append(' ');
                            int id2 = view2.getId();
                            if (id2 == -1) {
                                str = "NO_ID";
                            } else {
                                Resources resources = view2.getResources();
                                if (resources == null) {
                                    StringBuilder q10 = android.gov.nist.core.a.q("UNKNOWN_ID_NO_RESOURCES ", id2, " #");
                                    q10.append((Object) Integer.toHexString(id2));
                                    str = q10.toString();
                                } else if (id2 <= 0) {
                                    StringBuilder q11 = android.gov.nist.core.a.q("UNKNOWN_ID_NEGATIVE ", id2, " #");
                                    q11.append((Object) Integer.toHexString(id2));
                                    str = q11.toString();
                                } else if ((id2 >>> 24) == 0) {
                                    StringBuilder q12 = android.gov.nist.core.a.q("UNKNOWN_ID_NO_PACKAGE ", id2, " #");
                                    q12.append((Object) Integer.toHexString(id2));
                                    str = q12.toString();
                                } else {
                                    int i11 = (-16777216) & id2;
                                    if (i11 != 16777216) {
                                        if (i11 != 2130706432) {
                                            try {
                                                str2 = resources.getResourcePackageName(id2);
                                            } catch (Resources.NotFoundException unused) {
                                                StringBuilder q13 = android.gov.nist.core.a.q("UNKNOWN_ID_NOT_FOUND ", id2, " #");
                                                q13.append((Object) Integer.toHexString(id2));
                                                str = q13.toString();
                                            }
                                        } else {
                                            str2 = "app";
                                        }
                                    } else {
                                        str2 = "android";
                                    }
                                    String resourceTypeName = resources.getResourceTypeName(id2);
                                    String resourceEntryName = resources.getResourceEntryName(id2);
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append((Object) str2);
                                    sb3.append(':');
                                    sb3.append((Object) resourceTypeName);
                                    sb3.append('/');
                                    sb3.append((Object) resourceEntryName);
                                    str = sb3.toString();
                                }
                            }
                            sb2.append(str);
                            b14.f37622Y = sb2.toString();
                        }
                    }
                    return abstractC1979e;
                }
            });
        }
    }
}
