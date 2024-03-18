package r3;

import android.os.Handler;
import android.os.Message;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.openai.chatgpt.R;
import id.AbstractC3557B;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: r3.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractViewTreeObserver$OnPreDrawListenerC5361d implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: m0  reason: collision with root package name */
    public static final Field f44386m0;

    /* renamed from: Y  reason: collision with root package name */
    public final Choreographer f44387Y;

    /* renamed from: Z  reason: collision with root package name */
    public final List f44388Z;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f44389h0;

    /* renamed from: i0  reason: collision with root package name */
    public final ArrayList f44390i0 = new ArrayList();

    /* renamed from: j0  reason: collision with root package name */
    public final ArrayList f44391j0 = new ArrayList();

    /* renamed from: k0  reason: collision with root package name */
    public final WeakReference f44392k0;

    /* renamed from: l0  reason: collision with root package name */
    public final q f44393l0;

    static {
        Field declaredField = Choreographer.class.getDeclaredField("mLastFrameTimeNanos");
        AbstractC3557B.b0("Choreographer::class.jav\u2026ld(\"mLastFrameTimeNanos\")", declaredField);
        f44386m0 = declaredField;
        declaredField.setAccessible(true);
    }

    public AbstractViewTreeObserver$OnPreDrawListenerC5361d(View view, Choreographer choreographer, ArrayList arrayList) {
        AbstractC3557B.c0("choreographer", choreographer);
        this.f44387Y = choreographer;
        this.f44388Z = arrayList;
        this.f44392k0 = new WeakReference(view);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = (View) parent;
            parent = view.getParent();
        }
        Object tag = view.getTag(R.id.metricsStateHolder);
        if (tag == null) {
            tag = new Object();
            view.setTag(R.id.metricsStateHolder, tag);
        }
        this.f44393l0 = (q) tag;
    }

    public abstract void a(Message message);

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        final View view = (View) this.f44392k0.get();
        if (view != null) {
            Object obj = f44386m0.get(this.f44387Y);
            AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Long", obj);
            final long longValue = ((Long) obj).longValue();
            Handler handler = view.getHandler();
            Message obtain = Message.obtain(view.getHandler(), new Runnable() { // from class: r3.b
                @Override // java.lang.Runnable
                public final void run() {
                    long j6;
                    long j10;
                    View view2;
                    long j11;
                    i iVar;
                    k kVar;
                    boolean z10;
                    View view3 = view;
                    AbstractViewTreeObserver$OnPreDrawListenerC5361d abstractViewTreeObserver$OnPreDrawListenerC5361d = this;
                    long j12 = longValue;
                    View view4 = view;
                    AbstractC3557B.c0("this$0", abstractViewTreeObserver$OnPreDrawListenerC5361d);
                    AbstractC3557B.c0("$this_with", view4);
                    long nanoTime = System.nanoTime();
                    Field field = AbstractViewTreeObserver$OnPreDrawListenerC5361d.f44386m0;
                    long C10 = P5.c.C(view3);
                    synchronized (abstractViewTreeObserver$OnPreDrawListenerC5361d) {
                        try {
                            abstractViewTreeObserver$OnPreDrawListenerC5361d.f44389h0 = true;
                            for (j jVar : abstractViewTreeObserver$OnPreDrawListenerC5361d.f44388Z) {
                                long j13 = nanoTime - j12;
                                i iVar2 = jVar.f44405a;
                                long j14 = ((float) C10) * iVar2.f44404d;
                                k kVar2 = jVar.f44406b;
                                r rVar = kVar2.f44409j.f44424a;
                                if (rVar != null) {
                                    j10 = nanoTime;
                                    iVar = iVar2;
                                    j6 = C10;
                                    j11 = j13;
                                    view2 = view4;
                                    kVar = kVar2;
                                    rVar.c(j12, j12 + j13, kVar2.f44410k);
                                } else {
                                    view2 = view4;
                                    j10 = nanoTime;
                                    j6 = C10;
                                    iVar = iVar2;
                                    j11 = j13;
                                    kVar = kVar2;
                                }
                                if (j11 > j14) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                C5362e c5362e = kVar.f44411l;
                                c5362e.f44395b = j12;
                                c5362e.f44396c = j11;
                                c5362e.f44397d = z10;
                                iVar.a(c5362e);
                                view4 = view2;
                                nanoTime = j10;
                                C10 = j6;
                            }
                            View view5 = view4;
                            if (!abstractViewTreeObserver$OnPreDrawListenerC5361d.f44390i0.isEmpty()) {
                                Iterator it = abstractViewTreeObserver$OnPreDrawListenerC5361d.f44390i0.iterator();
                                while (it.hasNext()) {
                                    abstractViewTreeObserver$OnPreDrawListenerC5361d.f44388Z.add((j) it.next());
                                }
                                abstractViewTreeObserver$OnPreDrawListenerC5361d.f44390i0.clear();
                            }
                            if (!abstractViewTreeObserver$OnPreDrawListenerC5361d.f44391j0.isEmpty()) {
                                boolean z11 = !abstractViewTreeObserver$OnPreDrawListenerC5361d.f44388Z.isEmpty();
                                Iterator it2 = abstractViewTreeObserver$OnPreDrawListenerC5361d.f44391j0.iterator();
                                while (it2.hasNext()) {
                                    abstractViewTreeObserver$OnPreDrawListenerC5361d.f44388Z.remove((j) it2.next());
                                }
                                abstractViewTreeObserver$OnPreDrawListenerC5361d.f44391j0.clear();
                                if (z11 && abstractViewTreeObserver$OnPreDrawListenerC5361d.f44388Z.isEmpty()) {
                                    view5.getViewTreeObserver().removeOnPreDrawListener(abstractViewTreeObserver$OnPreDrawListenerC5361d);
                                    view5.setTag(R.id.metricsDelegator, null);
                                }
                            }
                            abstractViewTreeObserver$OnPreDrawListenerC5361d.f44389h0 = false;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    r rVar2 = abstractViewTreeObserver$OnPreDrawListenerC5361d.f44393l0.f44424a;
                    if (rVar2 != null) {
                        rVar2.b();
                    }
                }
            });
            AbstractC3557B.b0("this", obtain);
            a(obtain);
            handler.sendMessageAtFrontOfQueue(obtain);
            return true;
        }
        return true;
    }
}
