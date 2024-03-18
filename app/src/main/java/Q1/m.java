package Q1;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.lifecycle.AbstractC2072g;
import androidx.lifecycle.AbstractC2086v;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.S;

/* loaded from: classes2.dex */
public final class m implements DefaultLifecycleObserver {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ S f14336Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ EmojiCompatInitializer f14337Z;

    public m(EmojiCompatInitializer emojiCompatInitializer, S s10) {
        this.f14337Z = emojiCompatInitializer;
        this.f14336Y = s10;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(AbstractC2086v abstractC2086v) {
        AbstractC2072g.a(this, abstractC2086v);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onDestroy(AbstractC2086v abstractC2086v) {
        AbstractC2072g.b(this, abstractC2086v);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(AbstractC2086v abstractC2086v) {
        AbstractC2072g.c(this, abstractC2086v);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.lang.Runnable] */
    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(AbstractC2086v abstractC2086v) {
        Handler handler;
        this.f14337Z.getClass();
        if (Build.VERSION.SDK_INT >= 28) {
            handler = AbstractC1174b.a(Looper.getMainLooper());
        } else {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.postDelayed(new Object(), 500L);
        this.f14336Y.g(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(AbstractC2086v abstractC2086v) {
        AbstractC2072g.e(this, abstractC2086v);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(AbstractC2086v abstractC2086v) {
        AbstractC2072g.f(this, abstractC2086v);
    }
}
