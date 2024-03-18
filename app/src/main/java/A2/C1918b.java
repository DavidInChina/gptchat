package a2;

import K4.J;
import Ng.F;
import Y1.g;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import io.sentry.android.core.AbstractC3612c;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CancellationException;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wf.n;

/* renamed from: a2.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1918b extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public int f23851Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Intent f23852Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Context f23853h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1918b(Intent intent, Context context, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f23852Z = intent;
        this.f23853h0 = context;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C1918b(this.f23852Z, this.f23853h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1918b) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        Map map;
        Intent intent = this.f23852Z;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f23851Y;
        y yVar = y.f36177a;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    N.B0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                N.B0(obj);
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    Bundle bundle = extras.getBundle("ActionCallbackBroadcastReceiver:parameters");
                    if (bundle != null) {
                        g N10 = J.N(new Y1.d[0]);
                        Iterator<T> it = bundle.keySet().iterator();
                        while (true) {
                            boolean hasNext = it.hasNext();
                            map = N10.f22053a;
                            if (!hasNext) {
                                break;
                            }
                            String str = (String) it.next();
                            Y1.c cVar = new Y1.c(str);
                            Object obj2 = bundle.get(str);
                            map.get(cVar);
                            if (obj2 == null) {
                                map.remove(cVar);
                            } else {
                                map.put(cVar, obj2);
                            }
                        }
                        if (extras.containsKey("android.widget.extra.CHECKED")) {
                            Y1.c cVar2 = AbstractC1922f.f23858a;
                            Boolean valueOf = Boolean.valueOf(extras.getBoolean("android.widget.extra.CHECKED"));
                            map.get(cVar2);
                            map.put(cVar2, valueOf);
                        }
                        String string = extras.getString("ActionCallbackBroadcastReceiver:callbackClass");
                        if (string != null) {
                            if (intent.hasExtra("ActionCallbackBroadcastReceiver:appWidgetId")) {
                                extras.getInt("ActionCallbackBroadcastReceiver:appWidgetId");
                                Context context = this.f23853h0;
                                this.f23851Y = 1;
                                Class<?> cls = Class.forName(string);
                                if (AbstractC1917a.class.isAssignableFrom(cls)) {
                                    Object newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                                    AbstractC3557B.a0("null cannot be cast to non-null type androidx.glance.appwidget.action.ActionCallback", newInstance);
                                    ((AbstractC1917a) newInstance).a(context);
                                    EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
                                    if (yVar == enumC5000a) {
                                        return enumC5000a;
                                    }
                                } else {
                                    throw new IllegalStateException("Provided class must implement ActionCallback.".toString());
                                }
                            } else {
                                throw new IllegalArgumentException("To update the widget, the intent must contain the AppWidgetId integer using extra: ActionCallbackBroadcastReceiver:appWidgetId".toString());
                            }
                        } else {
                            throw new IllegalArgumentException("The intent must contain a work class name string using extra: ActionCallbackBroadcastReceiver:callbackClass".toString());
                        }
                    } else {
                        throw new IllegalArgumentException("The intent must contain a parameters bundle using extra: ActionCallbackBroadcastReceiver:parameters".toString());
                    }
                } else {
                    throw new IllegalArgumentException("The intent must have action parameters extras.".toString());
                }
            }
        } catch (CancellationException e10) {
            throw e10;
        } catch (Throwable th2) {
            AbstractC3612c.d("GlanceAppWidget", "Error in Glance App Widget", th2);
        }
        return yVar;
    }
}
