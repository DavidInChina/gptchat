package com.revenuecat.purchases.google;

import K4.AbstractC0815c;
import K4.B;
import K4.C0816d;
import K4.C0822j;
import K4.C0824l;
import K4.H;
import K4.m;
import android.app.Activity;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.view.View;
import com.google.android.gms.internal.play_billing.AbstractC2468q;
import com.google.android.gms.internal.play_billing.o1;
import com.google.android.gms.internal.play_billing.q1;
import com.google.android.gms.internal.play_billing.s1;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.strings.BillingStrings;
import id.AbstractC3557B;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.concurrent.Callable;
import jf.y;
import kotlin.Metadata;
import kotlin.jvm.internal.o;
import wf.AbstractC6216a;
import wf.k;
import y1.AbstractC6495e;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n\u00a2\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "Ljf/y;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class BillingWrapper$showInAppMessagesIfNeeded$1 extends o implements k {
    final /* synthetic */ C0824l $inAppMessageParams;
    final /* synthetic */ AbstractC6216a $subscriptionStatusChange;
    final /* synthetic */ WeakReference<Activity> $weakActivity;
    final /* synthetic */ BillingWrapper this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LK4/c;", "Ljf/y;", "invoke", "(LK4/c;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* renamed from: com.revenuecat.purchases.google.BillingWrapper$showInAppMessagesIfNeeded$1$1 */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends o implements k {
        final /* synthetic */ C0824l $inAppMessageParams;
        final /* synthetic */ AbstractC6216a $subscriptionStatusChange;
        final /* synthetic */ WeakReference<Activity> $weakActivity;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(WeakReference<Activity> weakReference, C0824l c0824l, AbstractC6216a abstractC6216a) {
            super(1);
            this.$weakActivity = weakReference;
            this.$inAppMessageParams = c0824l;
            this.$subscriptionStatusChange = abstractC6216a;
        }

        public static final void invoke$lambda$1(AbstractC6216a abstractC6216a, m mVar) {
            AbstractC3557B.c0("$subscriptionStatusChange", abstractC6216a);
            AbstractC3557B.c0("inAppMessageResult", mVar);
            int i10 = mVar.f9443a;
            if (i10 != 0) {
                if (i10 != 1) {
                    LogUtilsKt.errorLog$default(String.format(BillingStrings.BILLING_INAPP_MESSAGE_UNEXPECTED_CODE, Arrays.copyOf(new Object[]{Integer.valueOf(i10)}, 1)), null, 2, null);
                    return;
                }
                LogUtilsKt.debugLog(BillingStrings.BILLING_INAPP_MESSAGE_UPDATE);
                abstractC6216a.mo122invoke();
                return;
            }
            LogUtilsKt.verboseLog(BillingStrings.BILLING_INAPP_MESSAGE_NONE);
        }

        @Override // wf.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((AbstractC0815c) obj);
            return y.f36177a;
        }

        public final void invoke(AbstractC0815c abstractC0815c) {
            AbstractC3557B.c0("$this$withConnectedClient", abstractC0815c);
            final Activity activity = this.$weakActivity.get();
            if (activity == null) {
                LogUtilsKt.debugLog("Activity is null, not showing Google Play in-app message.");
                return;
            }
            C0824l c0824l = this.$inAppMessageParams;
            c cVar = new c(this.$subscriptionStatusChange);
            final C0816d c0816d = (C0816d) abstractC0815c;
            if (!c0816d.c()) {
                AbstractC2468q.e("BillingClient", "Service disconnected.");
                C0822j c0822j = H.f9352a;
            } else if (!c0816d.f9413o) {
                AbstractC2468q.e("BillingClient", "Current client doesn't support showing in-app messages.");
                C0822j c0822j2 = H.f9352a;
            } else {
                View findViewById = activity.findViewById(16908290);
                IBinder windowToken = findViewById.getWindowToken();
                Rect rect = new Rect();
                findViewById.getGlobalVisibleRect(rect);
                final Bundle bundle = new Bundle();
                AbstractC6495e.b(bundle, "KEY_WINDOW_TOKEN", windowToken);
                bundle.putInt("KEY_DIMEN_LEFT", rect.left);
                bundle.putInt("KEY_DIMEN_TOP", rect.top);
                bundle.putInt("KEY_DIMEN_RIGHT", rect.right);
                bundle.putInt("KEY_DIMEN_BOTTOM", rect.bottom);
                bundle.putString("playBillingLibraryVersion", c0816d.f9400b);
                bundle.putIntegerArrayList("KEY_CATEGORY_IDS", c0824l.f9442a);
                Handler handler = c0816d.f9401c;
                final B b10 = new B(handler, cVar, 0);
                c0816d.j(new Callable() { // from class: K4.z
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        C0816d c0816d2 = C0816d.this;
                        Bundle bundle2 = bundle;
                        Activity activity2 = activity;
                        ResultReceiver resultReceiver = b10;
                        q1 q1Var = c0816d2.f9405g;
                        String packageName = c0816d2.f9403e.getPackageName();
                        E e10 = new E(new WeakReference(activity2), resultReceiver);
                        o1 o1Var = (o1) q1Var;
                        Parcel j6 = o1Var.j();
                        j6.writeInt(12);
                        j6.writeString(packageName);
                        int i10 = s1.f26973a;
                        j6.writeInt(1);
                        bundle2.writeToParcel(j6, 0);
                        j6.writeStrongBinder(e10);
                        o1Var.l(j6, 1201);
                        return null;
                    }
                }, 5000L, null, handler);
                C0822j c0822j3 = H.f9352a;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingWrapper$showInAppMessagesIfNeeded$1(BillingWrapper billingWrapper, WeakReference<Activity> weakReference, C0824l c0824l, AbstractC6216a abstractC6216a) {
        super(1);
        this.this$0 = billingWrapper;
        this.$weakActivity = weakReference;
        this.$inAppMessageParams = c0824l;
        this.$subscriptionStatusChange = abstractC6216a;
    }

    @Override // wf.k
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PurchasesError) obj);
        return y.f36177a;
    }

    public final void invoke(PurchasesError purchasesError) {
        if (purchasesError != null) {
            LogUtilsKt.errorLog$default(String.format(BillingStrings.BILLING_CONNECTION_ERROR_INAPP_MESSAGES, Arrays.copyOf(new Object[]{purchasesError}, 1)), null, 2, null);
        } else {
            this.this$0.withConnectedClient(new AnonymousClass1(this.$weakActivity, this.$inAppMessageParams, this.$subscriptionStatusChange));
        }
    }
}
