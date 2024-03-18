package x3;

import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import id.AbstractC3557B;
import io.sentry.android.core.AbstractC3612c;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final String f48718a;

    /* renamed from: b  reason: collision with root package name */
    public final n f48719b;

    /* renamed from: c  reason: collision with root package name */
    public final Executor f48720c;

    /* renamed from: d  reason: collision with root package name */
    public int f48721d;

    /* renamed from: e  reason: collision with root package name */
    public final p f48722e;

    /* renamed from: f  reason: collision with root package name */
    public k f48723f;

    /* renamed from: g  reason: collision with root package name */
    public final q f48724g = new q(this);

    /* renamed from: h  reason: collision with root package name */
    public final AtomicBoolean f48725h = new AtomicBoolean(false);

    /* renamed from: i  reason: collision with root package name */
    public final o f48726i = new Runnable(this) { // from class: x3.o

        /* renamed from: Z  reason: collision with root package name */
        public final /* synthetic */ s f48711Z;

        {
            this.f48711Z = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            m mVar;
            switch (r2) {
                case 0:
                    s sVar = this.f48711Z;
                    AbstractC3557B.c0("this$0", sVar);
                    try {
                        k kVar = sVar.f48723f;
                        if (kVar != null) {
                            sVar.f48721d = kVar.a(sVar.f48724g, sVar.f48718a);
                            n nVar = sVar.f48719b;
                            p pVar = sVar.f48722e;
                            if (pVar != null) {
                                nVar.a(pVar);
                                return;
                            } else {
                                AbstractC3557B.C2("observer");
                                throw null;
                            }
                        }
                        return;
                    } catch (RemoteException e10) {
                        AbstractC3612c.s("ROOM", "Cannot register multi-instance invalidation callback", e10);
                        return;
                    }
                default:
                    s sVar2 = this.f48711Z;
                    AbstractC3557B.c0("this$0", sVar2);
                    n nVar2 = sVar2.f48719b;
                    p pVar2 = sVar2.f48722e;
                    if (pVar2 != null) {
                        nVar2.getClass();
                        synchronized (nVar2.f48706j) {
                            mVar = (m) nVar2.f48706j.r(pVar2);
                        }
                        if (mVar != null) {
                            l lVar = nVar2.f48705i;
                            int[] iArr = mVar.f48693b;
                            if (lVar.c(Arrays.copyOf(iArr, iArr.length))) {
                                y yVar = nVar2.f48697a;
                                if (yVar.k()) {
                                    nVar2.d(yVar.g().getWritableDatabase());
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    AbstractC3557B.C2("observer");
                    throw null;
            }
        }
    };

    /* renamed from: j  reason: collision with root package name */
    public final o f48727j = new Runnable(this) { // from class: x3.o

        /* renamed from: Z  reason: collision with root package name */
        public final /* synthetic */ s f48711Z;

        {
            this.f48711Z = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            m mVar;
            switch (r2) {
                case 0:
                    s sVar = this.f48711Z;
                    AbstractC3557B.c0("this$0", sVar);
                    try {
                        k kVar = sVar.f48723f;
                        if (kVar != null) {
                            sVar.f48721d = kVar.a(sVar.f48724g, sVar.f48718a);
                            n nVar = sVar.f48719b;
                            p pVar = sVar.f48722e;
                            if (pVar != null) {
                                nVar.a(pVar);
                                return;
                            } else {
                                AbstractC3557B.C2("observer");
                                throw null;
                            }
                        }
                        return;
                    } catch (RemoteException e10) {
                        AbstractC3612c.s("ROOM", "Cannot register multi-instance invalidation callback", e10);
                        return;
                    }
                default:
                    s sVar2 = this.f48711Z;
                    AbstractC3557B.c0("this$0", sVar2);
                    n nVar2 = sVar2.f48719b;
                    p pVar2 = sVar2.f48722e;
                    if (pVar2 != null) {
                        nVar2.getClass();
                        synchronized (nVar2.f48706j) {
                            mVar = (m) nVar2.f48706j.r(pVar2);
                        }
                        if (mVar != null) {
                            l lVar = nVar2.f48705i;
                            int[] iArr = mVar.f48693b;
                            if (lVar.c(Arrays.copyOf(iArr, iArr.length))) {
                                y yVar = nVar2.f48697a;
                                if (yVar.k()) {
                                    nVar2.d(yVar.g().getWritableDatabase());
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    AbstractC3557B.C2("observer");
                    throw null;
            }
        }
    };

    /* JADX WARN: Type inference failed for: r0v0, types: [x3.o] */
    /* JADX WARN: Type inference failed for: r0v1, types: [x3.o] */
    public s(Context context, String str, Intent intent, n nVar, Executor executor) {
        this.f48718a = str;
        this.f48719b = nVar;
        this.f48720c = executor;
        Context applicationContext = context.getApplicationContext();
        r rVar = new r(0, this);
        Object[] array = nVar.f48700d.keySet().toArray(new String[0]);
        AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>", array);
        this.f48722e = new p(this, (String[]) array);
        applicationContext.bindService(intent, rVar, 1);
    }
}
