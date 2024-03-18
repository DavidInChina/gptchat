package m;

import android.content.DialogInterface;
import android.media.MediaCodec;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: m.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class HandlerC4525e extends Handler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f38743a = 2;

    /* renamed from: b  reason: collision with root package name */
    public final Object f38744b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC4525e(C2.e eVar, Looper looper) {
        super(looper);
        this.f38744b = eVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C2.d dVar = null;
        switch (this.f38743a) {
            case 0:
                int i10 = message.what;
                if (i10 != -3 && i10 != -2 && i10 != -1) {
                    if (i10 == 1) {
                        ((DialogInterface) message.obj).dismiss();
                        return;
                    }
                    return;
                }
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) ((WeakReference) this.f38744b).get(), message.what);
                return;
            case 1:
                int i11 = message.what;
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            throw new RuntimeException("Unknown message " + message);
                        }
                        AbstractC2469q0.p(this.f38744b);
                        throw null;
                    }
                    AbstractC2469q0.p(this.f38744b);
                    throw null;
                }
                AbstractC2469q0.p(this.f38744b);
                throw null;
            default:
                C2.e eVar = (C2.e) this.f38744b;
                ArrayDeque arrayDeque = C2.e.f2516g;
                eVar.getClass();
                int i12 = message.what;
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            AtomicReference atomicReference = eVar.f2521d;
                            IllegalStateException illegalStateException = new IllegalStateException(String.valueOf(message.what));
                            while (!atomicReference.compareAndSet(null, illegalStateException) && atomicReference.get() == null) {
                            }
                        } else {
                            eVar.f2522e.d();
                        }
                    } else {
                        C2.d dVar2 = (C2.d) message.obj;
                        int i13 = dVar2.f2510a;
                        int i14 = dVar2.f2511b;
                        MediaCodec.CryptoInfo cryptoInfo = dVar2.f2513d;
                        long j6 = dVar2.f2514e;
                        int i15 = dVar2.f2515f;
                        try {
                            synchronized (C2.e.f2517h) {
                                eVar.f2518a.queueSecureInputBuffer(i13, i14, cryptoInfo, j6, i15);
                            }
                        } catch (RuntimeException e10) {
                            AtomicReference atomicReference2 = eVar.f2521d;
                            while (!atomicReference2.compareAndSet(null, e10) && atomicReference2.get() == null) {
                            }
                        }
                        dVar = dVar2;
                    }
                } else {
                    C2.d dVar3 = (C2.d) message.obj;
                    try {
                        eVar.f2518a.queueInputBuffer(dVar3.f2510a, dVar3.f2511b, dVar3.f2512c, dVar3.f2514e, dVar3.f2515f);
                    } catch (RuntimeException e11) {
                        AtomicReference atomicReference3 = eVar.f2521d;
                        while (!atomicReference3.compareAndSet(null, e11) && atomicReference3.get() == null) {
                        }
                    }
                    dVar = dVar3;
                }
                if (dVar != null) {
                    C2.e.c(dVar);
                    return;
                }
                return;
        }
    }

    public HandlerC4525e(DialogInterface dialogInterface) {
        this.f38744b = new WeakReference(dialogInterface);
    }
}
