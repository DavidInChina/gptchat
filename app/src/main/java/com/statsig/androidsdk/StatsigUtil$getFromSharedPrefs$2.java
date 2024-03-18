package com.statsig.androidsdk;

import Ng.F;
import android.content.SharedPreferences;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import kotlin.Metadata;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5158e;
import pf.AbstractC5163j;
import wf.n;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@\u00a2\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LNg/F;", "", "<anonymous>", "(LNg/F;)Ljava/lang/String;"}, k = 3, mv = {1, 5, 1})
@AbstractC5158e(c = "com.statsig.androidsdk.StatsigUtil$getFromSharedPrefs$2", f = "StatsigUtil.kt", l = {68}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class StatsigUtil$getFromSharedPrefs$2 extends AbstractC5163j implements n {
    final /* synthetic */ String $key;
    final /* synthetic */ SharedPreferences $sharedPrefs;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatsigUtil$getFromSharedPrefs$2(SharedPreferences sharedPreferences, String str, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.$sharedPrefs = sharedPreferences;
        this.$key = str;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new StatsigUtil$getFromSharedPrefs$2(this.$sharedPrefs, this.$key, abstractC4825e);
    }

    public final Object invoke(F f6, AbstractC4825e abstractC4825e) {
        return ((StatsigUtil$getFromSharedPrefs$2) create(f6, abstractC4825e)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
                return null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        N.B0(obj);
        try {
            return this.$sharedPrefs.getString(this.$key, null);
        } catch (ClassCastException unused) {
            StatsigUtil statsigUtil = StatsigUtil.INSTANCE;
            SharedPreferences sharedPreferences = this.$sharedPrefs;
            String str = this.$key;
            this.label = 1;
            if (statsigUtil.removeFromSharedPrefs$build_release(sharedPreferences, str, this) != enumC5000a) {
                return null;
            }
            return enumC5000a;
        }
    }
}
