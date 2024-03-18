package androidx.appcompat.widget;

import D1.H;
import D1.Z;
import U3.u;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.gov.nist.core.Separators;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import com.openai.chatgpt.R;
import fi.i;
import io.sentry.android.core.AbstractC3612c;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import kotlin.jvm.internal.m;
import l.AbstractC4308a;
import q.C5196b1;
import q.C5208f1;
import q.C5211g1;
import q.C5230q;
import q.F0;
import q.H0;
import q.RunnableC5199c1;
import q.View$OnFocusChangeListenerC5202d1;
import q.View$OnLayoutChangeListenerC5205e1;
import q.h1;
import q.i1;
import q.j1;
import q.l1;
import q.m1;
import q.o1;

/* loaded from: classes2.dex */
public class SearchView extends F0 implements androidx.appcompat.view.d {

    /* renamed from: k1  reason: collision with root package name */
    public static final i f24531k1;

    /* renamed from: A0  reason: collision with root package name */
    public final ImageView f24532A0;

    /* renamed from: B0  reason: collision with root package name */
    public final ImageView f24533B0;

    /* renamed from: C0  reason: collision with root package name */
    public final ImageView f24534C0;

    /* renamed from: D0  reason: collision with root package name */
    public final ImageView f24535D0;

    /* renamed from: E0  reason: collision with root package name */
    public final View f24536E0;

    /* renamed from: F0  reason: collision with root package name */
    public m1 f24537F0;

    /* renamed from: G0  reason: collision with root package name */
    public final Rect f24538G0;

    /* renamed from: H0  reason: collision with root package name */
    public final Rect f24539H0;

    /* renamed from: I0  reason: collision with root package name */
    public final int[] f24540I0;

    /* renamed from: J0  reason: collision with root package name */
    public final int[] f24541J0;

    /* renamed from: K0  reason: collision with root package name */
    public final ImageView f24542K0;

    /* renamed from: L0  reason: collision with root package name */
    public final Drawable f24543L0;

    /* renamed from: M0  reason: collision with root package name */
    public final int f24544M0;

    /* renamed from: N0  reason: collision with root package name */
    public final int f24545N0;

    /* renamed from: O0  reason: collision with root package name */
    public final Intent f24546O0;

    /* renamed from: P0  reason: collision with root package name */
    public final Intent f24547P0;

    /* renamed from: Q0  reason: collision with root package name */
    public final CharSequence f24548Q0;

    /* renamed from: R0  reason: collision with root package name */
    public View.OnFocusChangeListener f24549R0;

    /* renamed from: S0  reason: collision with root package name */
    public View.OnClickListener f24550S0;

    /* renamed from: T0  reason: collision with root package name */
    public boolean f24551T0;

    /* renamed from: U0  reason: collision with root package name */
    public boolean f24552U0;

    /* renamed from: V0  reason: collision with root package name */
    public I1.a f24553V0;

    /* renamed from: W0  reason: collision with root package name */
    public boolean f24554W0;

    /* renamed from: X0  reason: collision with root package name */
    public CharSequence f24555X0;

    /* renamed from: Y0  reason: collision with root package name */
    public boolean f24556Y0;

    /* renamed from: Z0  reason: collision with root package name */
    public boolean f24557Z0;

    /* renamed from: a1  reason: collision with root package name */
    public int f24558a1;
    public boolean b1;

    /* renamed from: c1  reason: collision with root package name */
    public CharSequence f24559c1;

    /* renamed from: d1  reason: collision with root package name */
    public boolean f24560d1;

    /* renamed from: e1  reason: collision with root package name */
    public int f24561e1;

    /* renamed from: f1  reason: collision with root package name */
    public SearchableInfo f24562f1;
    public Bundle g1;

    /* renamed from: h1  reason: collision with root package name */
    public final RunnableC5199c1 f24563h1;

    /* renamed from: i1  reason: collision with root package name */
    public final RunnableC5199c1 f24564i1;

    /* renamed from: j1  reason: collision with root package name */
    public final WeakHashMap f24565j1;

    /* renamed from: w0  reason: collision with root package name */
    public final SearchAutoComplete f24566w0;

    /* renamed from: x0  reason: collision with root package name */
    public final View f24567x0;

    /* renamed from: y0  reason: collision with root package name */
    public final View f24568y0;

    /* renamed from: z0  reason: collision with root package name */
    public final View f24569z0;

    /* loaded from: classes2.dex */
    public static class SearchAutoComplete extends C5230q {

        /* renamed from: m0  reason: collision with root package name */
        public SearchView f24571m0;

        /* renamed from: n0  reason: collision with root package name */
        public boolean f24572n0;

        /* renamed from: o0  reason: collision with root package name */
        public final d f24573o0 = new d(this);

        /* renamed from: l0  reason: collision with root package name */
        public int f24570l0 = getThreshold();

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i10 = configuration.screenWidthDp;
            int i11 = configuration.screenHeightDp;
            if (i10 >= 960 && i11 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i10 < 600) {
                if (i10 < 640 || i11 < 480) {
                    return 160;
                }
                return 192;
            }
            return 192;
        }

        public final void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                c.b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            i iVar = SearchView.f24531k1;
            iVar.getClass();
            i.a();
            Method method = iVar.f30920c;
            if (method != null) {
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            if (this.f24570l0 > 0 && !super.enoughToFilter()) {
                return false;
            }
            return true;
        }

        @Override // q.C5230q, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f24572n0) {
                d dVar = this.f24573o0;
                removeCallbacks(dVar);
                post(dVar);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z10, int i10, Rect rect) {
            super.onFocusChanged(z10, i10, rect);
            SearchView searchView = this.f24571m0;
            searchView.y(searchView.f24552U0);
            searchView.post(searchView.f24563h1);
            if (searchView.f24566w0.hasFocus()) {
                searchView.n();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
            if (i10 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f24571m0.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i10, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z10) {
            super.onWindowFocusChanged(z10);
            if (z10 && this.f24571m0.hasFocus() && getVisibility() == 0) {
                this.f24572n0 = true;
                Context context = getContext();
                i iVar = SearchView.f24531k1;
                if (context.getResources().getConfiguration().orientation == 2) {
                    a();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z10) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            d dVar = this.f24573o0;
            if (!z10) {
                this.f24572n0 = false;
                removeCallbacks(dVar);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f24572n0 = false;
                removeCallbacks(dVar);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f24572n0 = true;
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f24571m0 = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i10) {
            super.setThreshold(i10);
            this.f24570l0 = i10;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [fi.i, java.lang.Object] */
    static {
        i iVar = null;
        if (Build.VERSION.SDK_INT < 29) {
            ?? obj = new Object();
            obj.f30918a = null;
            obj.f30919b = null;
            obj.f30920c = null;
            i.a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                obj.f30918a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                obj.f30919b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                obj.f30920c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
            iVar = obj;
        }
        f24531k1 = iVar;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        int i10;
        SearchAutoComplete searchAutoComplete = this.f24566w0;
        searchAutoComplete.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            i10 = 0;
        } else {
            i10 = charSequence.length();
        }
        searchAutoComplete.setSelection(i10);
    }

    @Override // androidx.appcompat.view.d
    public final void c() {
        if (this.f24560d1) {
            return;
        }
        this.f24560d1 = true;
        SearchAutoComplete searchAutoComplete = this.f24566w0;
        int imeOptions = searchAutoComplete.getImeOptions();
        this.f24561e1 = imeOptions;
        searchAutoComplete.setImeOptions(imeOptions | 33554432);
        searchAutoComplete.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.f24557Z0 = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.f24566w0;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.f24557Z0 = false;
    }

    @Override // androidx.appcompat.view.d
    public final void e() {
        SearchAutoComplete searchAutoComplete = this.f24566w0;
        searchAutoComplete.setText("");
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.f24559c1 = "";
        clearFocus();
        y(true);
        searchAutoComplete.setImeOptions(this.f24561e1);
        this.f24560d1 = false;
    }

    public int getImeOptions() {
        return this.f24566w0.getImeOptions();
    }

    public int getInputType() {
        return this.f24566w0.getInputType();
    }

    public int getMaxWidth() {
        return this.f24558a1;
    }

    public CharSequence getQuery() {
        return this.f24566w0.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f24555X0;
        if (charSequence == null) {
            SearchableInfo searchableInfo = this.f24562f1;
            if (searchableInfo != null && searchableInfo.getHintId() != 0) {
                return getContext().getText(this.f24562f1.getHintId());
            }
            return this.f24548Q0;
        }
        return charSequence;
    }

    public int getSuggestionCommitIconResId() {
        return this.f24545N0;
    }

    public int getSuggestionRowLayout() {
        return this.f24544M0;
    }

    public I1.a getSuggestionsAdapter() {
        return this.f24553V0;
    }

    public final Intent l(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f24559c1);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.g1;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.f24562f1.getSearchActivity());
        return intent;
    }

    public final Intent m(Intent intent, SearchableInfo searchableInfo) {
        String str;
        String str2;
        String str3;
        int i10;
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.g1;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        if (searchableInfo.getVoiceLanguageModeId() != 0) {
            str = resources.getString(searchableInfo.getVoiceLanguageModeId());
        } else {
            str = "free_form";
        }
        String str4 = null;
        if (searchableInfo.getVoicePromptTextId() != 0) {
            str2 = resources.getString(searchableInfo.getVoicePromptTextId());
        } else {
            str2 = null;
        }
        if (searchableInfo.getVoiceLanguageId() != 0) {
            str3 = resources.getString(searchableInfo.getVoiceLanguageId());
        } else {
            str3 = null;
        }
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i10 = searchableInfo.getVoiceMaxResults();
        } else {
            i10 = 1;
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", str);
        intent3.putExtra("android.speech.extra.PROMPT", str2);
        intent3.putExtra("android.speech.extra.LANGUAGE", str3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i10);
        if (searchActivity != null) {
            str4 = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str4);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void n() {
        int i10 = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.f24566w0;
        if (i10 >= 29) {
            c.a(searchAutoComplete);
            return;
        }
        i iVar = f24531k1;
        iVar.getClass();
        i.a();
        Method method = iVar.f30918a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused) {
            }
        }
        iVar.getClass();
        i.a();
        Method method2 = iVar.f30919b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused2) {
            }
        }
    }

    public final void o() {
        SearchAutoComplete searchAutoComplete = this.f24566w0;
        if (TextUtils.isEmpty(searchAutoComplete.getText())) {
            if (this.f24551T0) {
                clearFocus();
                y(true);
                return;
            }
            return;
        }
        searchAutoComplete.setText("");
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.f24563h1);
        post(this.f24564i1);
        super.onDetachedFromWindow();
    }

    @Override // q.F0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            int[] iArr = this.f24540I0;
            SearchAutoComplete searchAutoComplete = this.f24566w0;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.f24541J0;
            getLocationInWindow(iArr2);
            int i14 = iArr[1] - iArr2[1];
            int i15 = iArr[0] - iArr2[0];
            Rect rect = this.f24538G0;
            rect.set(i15, i14, searchAutoComplete.getWidth() + i15, searchAutoComplete.getHeight() + i14);
            int i16 = rect.left;
            int i17 = rect.right;
            int i18 = i13 - i11;
            Rect rect2 = this.f24539H0;
            rect2.set(i16, 0, i17, i18);
            m1 m1Var = this.f24537F0;
            if (m1Var == null) {
                m1 m1Var2 = new m1(rect2, rect, searchAutoComplete);
                this.f24537F0 = m1Var2;
                setTouchDelegate(m1Var2);
                return;
            }
            m1Var.f43475b.set(rect2);
            Rect rect3 = m1Var.f43477d;
            rect3.set(rect2);
            int i19 = -m1Var.f43478e;
            rect3.inset(i19, i19);
            m1Var.f43476c.set(rect);
        }
    }

    @Override // q.F0, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        if (this.f24552U0) {
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824 && (i12 = this.f24558a1) > 0) {
                    size = Math.min(i12, size);
                }
            } else {
                size = this.f24558a1;
                if (size <= 0) {
                    size = getPreferredWidth();
                }
            }
        } else {
            int i13 = this.f24558a1;
            size = i13 > 0 ? Math.min(i13, size) : Math.min(getPreferredWidth(), size);
        }
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 0) {
                size2 = getPreferredHeight();
            }
        } else {
            size2 = Math.min(getPreferredHeight(), size2);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof l1)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        l1 l1Var = (l1) parcelable;
        super.onRestoreInstanceState(l1Var.f9325Y);
        y(l1Var.f43450h0);
        requestLayout();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Parcelable, q.l1, K1.b] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? bVar = new K1.b(super.onSaveInstanceState());
        bVar.f43450h0 = this.f24552U0;
        return bVar;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        post(this.f24563h1);
    }

    public final void p(int i10) {
        int i11;
        Uri uri;
        String h10;
        Cursor cursor = this.f24553V0.f7951h0;
        if (cursor != null && cursor.moveToPosition(i10)) {
            Intent intent = null;
            try {
                int i12 = o1.f43491C0;
                String h11 = o1.h(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (h11 == null) {
                    h11 = this.f24562f1.getSuggestIntentAction();
                }
                if (h11 == null) {
                    h11 = "android.intent.action.SEARCH";
                }
                String h12 = o1.h(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (h12 == null) {
                    h12 = this.f24562f1.getSuggestIntentData();
                }
                if (h12 != null && (h10 = o1.h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    h12 = h12 + Separators.SLASH + Uri.encode(h10);
                }
                if (h12 == null) {
                    uri = null;
                } else {
                    uri = Uri.parse(h12);
                }
                intent = l(h11, uri, o1.h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), o1.h(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e10) {
                try {
                    i11 = cursor.getPosition();
                } catch (RuntimeException unused) {
                    i11 = -1;
                }
                AbstractC3612c.s("SearchView", "Search suggestions cursor at row " + i11 + " returned exception.", e10);
            }
            if (intent != null) {
                try {
                    getContext().startActivity(intent);
                } catch (RuntimeException e11) {
                    AbstractC3612c.d("SearchView", "Failed launch activity: " + intent, e11);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.f24566w0;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void q(int i10) {
        Editable text = this.f24566w0.getText();
        Cursor cursor = this.f24553V0.f7951h0;
        if (cursor != null) {
            if (cursor.moveToPosition(i10)) {
                String c10 = this.f24553V0.c(cursor);
                if (c10 != null) {
                    setQuery(c10);
                    return;
                } else {
                    setQuery(text);
                    return;
                }
            }
            setQuery(text);
        }
    }

    public final void r(CharSequence charSequence) {
        setQuery(charSequence);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i10, Rect rect) {
        if (this.f24557Z0 || !isFocusable()) {
            return false;
        }
        if (!this.f24552U0) {
            boolean requestFocus = this.f24566w0.requestFocus(i10, rect);
            if (requestFocus) {
                y(false);
            }
            return requestFocus;
        }
        return super.requestFocus(i10, rect);
    }

    public final void s() {
        SearchAutoComplete searchAutoComplete = this.f24566w0;
        Editable text = searchAutoComplete.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            if (this.f24562f1 != null) {
                getContext().startActivity(l("android.intent.action.SEARCH", null, null, text.toString()));
            }
            searchAutoComplete.setImeVisibility(false);
            searchAutoComplete.dismissDropDown();
        }
    }

    public void setAppSearchData(Bundle bundle) {
        this.g1 = bundle;
    }

    public void setIconified(boolean z10) {
        if (z10) {
            o();
            return;
        }
        y(false);
        SearchAutoComplete searchAutoComplete = this.f24566w0;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f24550S0;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z10) {
        if (this.f24551T0 == z10) {
            return;
        }
        this.f24551T0 = z10;
        y(z10);
        v();
    }

    public void setImeOptions(int i10) {
        this.f24566w0.setImeOptions(i10);
    }

    public void setInputType(int i10) {
        this.f24566w0.setInputType(i10);
    }

    public void setMaxWidth(int i10) {
        this.f24558a1 = i10;
        requestLayout();
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f24549R0 = onFocusChangeListener;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f24550S0 = onClickListener;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f24555X0 = charSequence;
        v();
    }

    public void setQueryRefinementEnabled(boolean z10) {
        int i10;
        this.f24556Y0 = z10;
        I1.a aVar = this.f24553V0;
        if (aVar instanceof o1) {
            o1 o1Var = (o1) aVar;
            if (z10) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            o1Var.f43502u0 = i10;
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        int i10;
        this.f24562f1 = searchableInfo;
        Intent intent = null;
        boolean z10 = true;
        SearchAutoComplete searchAutoComplete = this.f24566w0;
        if (searchableInfo != null) {
            searchAutoComplete.setThreshold(searchableInfo.getSuggestThreshold());
            searchAutoComplete.setImeOptions(this.f24562f1.getImeOptions());
            int inputType = this.f24562f1.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.f24562f1.getSuggestAuthority() != null) {
                    inputType |= 589824;
                }
            }
            searchAutoComplete.setInputType(inputType);
            I1.a aVar = this.f24553V0;
            if (aVar != null) {
                aVar.b(null);
            }
            if (this.f24562f1.getSuggestAuthority() != null) {
                o1 o1Var = new o1(getContext(), this, this.f24562f1, this.f24565j1);
                this.f24553V0 = o1Var;
                searchAutoComplete.setAdapter(o1Var);
                o1 o1Var2 = (o1) this.f24553V0;
                if (this.f24556Y0) {
                    i10 = 2;
                } else {
                    i10 = 1;
                }
                o1Var2.f43502u0 = i10;
            }
            v();
        }
        SearchableInfo searchableInfo2 = this.f24562f1;
        boolean z11 = false;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.f24562f1.getVoiceSearchLaunchWebSearch()) {
                intent = this.f24546O0;
            } else if (this.f24562f1.getVoiceSearchLaunchRecognizer()) {
                intent = this.f24547P0;
            }
            if (intent != null) {
                if (getContext().getPackageManager().resolveActivity(intent, 65536) == null) {
                    z10 = false;
                }
                z11 = z10;
            }
        }
        this.b1 = z11;
        if (z11) {
            searchAutoComplete.setPrivateImeOptions("nm");
        }
        y(this.f24552U0);
    }

    public void setSubmitButtonEnabled(boolean z10) {
        this.f24554W0 = z10;
        y(this.f24552U0);
    }

    public void setSuggestionsAdapter(I1.a aVar) {
        this.f24553V0 = aVar;
        this.f24566w0.setAdapter(aVar);
    }

    public final void t() {
        int[] iArr;
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.f24566w0.getText());
        int i10 = 0;
        if (!z11 && (!this.f24551T0 || this.f24560d1)) {
            z10 = false;
        }
        if (!z10) {
            i10 = 8;
        }
        ImageView imageView = this.f24534C0;
        imageView.setVisibility(i10);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            if (z11) {
                iArr = ViewGroup.ENABLED_STATE_SET;
            } else {
                iArr = ViewGroup.EMPTY_STATE_SET;
            }
            drawable.setState(iArr);
        }
    }

    public final void u() {
        int[] iArr;
        if (this.f24566w0.hasFocus()) {
            iArr = ViewGroup.FOCUSED_STATE_SET;
        } else {
            iArr = ViewGroup.EMPTY_STATE_SET;
        }
        Drawable background = this.f24568y0.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f24569z0.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void v() {
        Drawable drawable;
        SpannableStringBuilder queryHint = getQueryHint();
        if (queryHint == null) {
            queryHint = "";
        }
        boolean z10 = this.f24551T0;
        SearchAutoComplete searchAutoComplete = this.f24566w0;
        if (z10 && (drawable = this.f24543L0) != null) {
            int textSize = (int) (searchAutoComplete.getTextSize() * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    public final void w() {
        int i10;
        if ((this.f24554W0 || this.b1) && !this.f24552U0 && (this.f24533B0.getVisibility() == 0 || this.f24535D0.getVisibility() == 0)) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f24569z0.setVisibility(i10);
    }

    public final void x(boolean z10) {
        int i10;
        boolean z11 = this.f24554W0;
        if (z11 && ((z11 || this.b1) && !this.f24552U0 && hasFocus() && (z10 || !this.b1))) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        this.f24533B0.setVisibility(i10);
    }

    public final void y(boolean z10) {
        int i10;
        int i11;
        int i12;
        this.f24552U0 = z10;
        int i13 = 8;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        boolean isEmpty = TextUtils.isEmpty(this.f24566w0.getText());
        this.f24532A0.setVisibility(i10);
        x(!isEmpty);
        if (z10) {
            i11 = 8;
        } else {
            i11 = 0;
        }
        this.f24567x0.setVisibility(i11);
        ImageView imageView = this.f24542K0;
        if (imageView.getDrawable() != null && !this.f24551T0) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        imageView.setVisibility(i12);
        t();
        if (this.b1 && !this.f24552U0 && isEmpty) {
            this.f24533B0.setVisibility(8);
            i13 = 0;
        }
        this.f24535D0.setVisibility(i13);
        w();
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f24538G0 = new Rect();
        this.f24539H0 = new Rect();
        this.f24540I0 = new int[2];
        this.f24541J0 = new int[2];
        this.f24563h1 = new RunnableC5199c1(this, 0);
        this.f24564i1 = new RunnableC5199c1(this, 1);
        this.f24565j1 = new WeakHashMap();
        a aVar = new a(this);
        b bVar = new b(this);
        C5208f1 c5208f1 = new C5208f1(this);
        C5211g1 c5211g1 = new C5211g1(this, 0);
        H0 h02 = new H0(1, this);
        C5196b1 c5196b1 = new C5196b1(this, 0);
        int[] iArr = AbstractC4308a.f37684u;
        u uVar = new u(context, context.obtainStyledAttributes(attributeSet, iArr, i10, 0));
        Z.k(this, context, iArr, attributeSet, (TypedArray) uVar.f17493h0, i10);
        LayoutInflater.from(context).inflate(uVar.z(19, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.f24566w0 = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f24567x0 = findViewById(R.id.search_edit_frame);
        View findViewById = findViewById(R.id.search_plate);
        this.f24568y0 = findViewById;
        View findViewById2 = findViewById(R.id.submit_area);
        this.f24569z0 = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.f24532A0 = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.f24533B0 = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.f24534C0 = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.f24535D0 = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.f24542K0 = imageView5;
        H.q(findViewById, uVar.t(20));
        H.q(findViewById2, uVar.t(25));
        imageView.setImageDrawable(uVar.t(23));
        imageView2.setImageDrawable(uVar.t(15));
        imageView3.setImageDrawable(uVar.t(12));
        imageView4.setImageDrawable(uVar.t(28));
        imageView5.setImageDrawable(uVar.t(23));
        this.f24543L0 = uVar.t(22);
        m.I(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.f24544M0 = uVar.z(26, R.layout.abc_search_dropdown_item_icons_2line);
        this.f24545N0 = uVar.z(13, 0);
        imageView.setOnClickListener(aVar);
        imageView3.setOnClickListener(aVar);
        imageView2.setOnClickListener(aVar);
        imageView4.setOnClickListener(aVar);
        searchAutoComplete.setOnClickListener(aVar);
        searchAutoComplete.addTextChangedListener(c5196b1);
        searchAutoComplete.setOnEditorActionListener(c5208f1);
        searchAutoComplete.setOnItemClickListener(c5211g1);
        searchAutoComplete.setOnItemSelectedListener(h02);
        searchAutoComplete.setOnKeyListener(bVar);
        searchAutoComplete.setOnFocusChangeListener(new View$OnFocusChangeListenerC5202d1(this));
        setIconifiedByDefault(uVar.o(18, true));
        int s10 = uVar.s(2, -1);
        if (s10 != -1) {
            setMaxWidth(s10);
        }
        this.f24548Q0 = uVar.C(14);
        this.f24555X0 = uVar.C(21);
        int x10 = uVar.x(6, -1);
        if (x10 != -1) {
            setImeOptions(x10);
        }
        int x11 = uVar.x(5, -1);
        if (x11 != -1) {
            setInputType(x11);
        }
        setFocusable(uVar.o(1, true));
        uVar.N();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f24546O0 = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f24547P0 = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f24536E0 = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new View$OnLayoutChangeListenerC5205e1(0, this));
        }
        y(this.f24551T0);
        v();
    }

    public void setOnCloseListener(h1 h1Var) {
    }

    public void setOnQueryTextListener(i1 i1Var) {
    }

    public void setOnSuggestionListener(j1 j1Var) {
    }
}
