package q;

import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.gov.nist.core.Separators;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import com.openai.chatgpt.R;
import io.sentry.android.core.AbstractC3612c;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;
import livekit.org.webrtc.WebrtcBuildVersion;
import p1.AbstractC5038c;
import p1.AbstractC5042g;

/* loaded from: classes.dex */
public final class o1 extends I1.a implements View.OnClickListener {

    /* renamed from: C0  reason: collision with root package name */
    public static final /* synthetic */ int f43491C0 = 0;

    /* renamed from: m0  reason: collision with root package name */
    public final int f43494m0;

    /* renamed from: n0  reason: collision with root package name */
    public final int f43495n0;

    /* renamed from: o0  reason: collision with root package name */
    public final LayoutInflater f43496o0;

    /* renamed from: p0  reason: collision with root package name */
    public final SearchView f43497p0;

    /* renamed from: q0  reason: collision with root package name */
    public final SearchableInfo f43498q0;

    /* renamed from: r0  reason: collision with root package name */
    public final Context f43499r0;

    /* renamed from: s0  reason: collision with root package name */
    public final WeakHashMap f43500s0;

    /* renamed from: t0  reason: collision with root package name */
    public final int f43501t0;

    /* renamed from: v0  reason: collision with root package name */
    public ColorStateList f43503v0;

    /* renamed from: u0  reason: collision with root package name */
    public int f43502u0 = 1;

    /* renamed from: w0  reason: collision with root package name */
    public int f43504w0 = -1;

    /* renamed from: x0  reason: collision with root package name */
    public int f43505x0 = -1;

    /* renamed from: y0  reason: collision with root package name */
    public int f43506y0 = -1;

    /* renamed from: z0  reason: collision with root package name */
    public int f43507z0 = -1;

    /* renamed from: A0  reason: collision with root package name */
    public int f43492A0 = -1;

    /* renamed from: B0  reason: collision with root package name */
    public int f43493B0 = -1;

    public o1(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        this.f7950Z = true;
        this.f7951h0 = null;
        this.f7949Y = false;
        this.f7952i0 = -1;
        this.f7953j0 = new H0.u1(this);
        this.f7954k0 = new K0(1, this);
        this.f43495n0 = suggestionRowLayout;
        this.f43494m0 = suggestionRowLayout;
        this.f43496o0 = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f43497p0 = searchView;
        this.f43498q0 = searchableInfo;
        this.f43501t0 = searchView.getSuggestionCommitIconResId();
        this.f43499r0 = context;
        this.f43500s0 = weakHashMap;
    }

    public static String h(Cursor cursor, int i10) {
        if (i10 == -1) {
            return null;
        }
        try {
            return cursor.getString(i10);
        } catch (Exception e10) {
            AbstractC3612c.d("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e10);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013e  */
    @Override // I1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(View view, Cursor cursor) {
        int i10;
        int i11;
        int i12;
        ImageView imageView;
        Drawable drawable;
        Drawable drawable2;
        Drawable.ConstantState constantState;
        ActivityInfo activityInfo;
        int iconResource;
        String str;
        n1 n1Var = (n1) view.getTag();
        int i13 = this.f43493B0;
        if (i13 != -1) {
            i10 = cursor.getInt(i13);
        } else {
            i10 = 0;
        }
        TextView textView = n1Var.f43480a;
        if (textView != null) {
            String h10 = h(cursor, this.f43504w0);
            textView.setText(h10);
            if (TextUtils.isEmpty(h10)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
            }
        }
        Context context = this.f43499r0;
        TextView textView2 = n1Var.f43481b;
        if (textView2 != null) {
            String h11 = h(cursor, this.f43506y0);
            if (h11 != null) {
                if (this.f43503v0 == null) {
                    TypedValue typedValue = new TypedValue();
                    context.getTheme().resolveAttribute(R.attr.textColorSearchUrl, typedValue, true);
                    this.f43503v0 = context.getResources().getColorStateList(typedValue.resourceId);
                }
                SpannableString spannableString = new SpannableString(h11);
                spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f43503v0, null), 0, h11.length(), 33);
                str = spannableString;
            } else {
                str = h(cursor, this.f43505x0);
            }
            if (TextUtils.isEmpty(str)) {
                if (textView != null) {
                    textView.setSingleLine(false);
                    textView.setMaxLines(2);
                }
            } else if (textView != null) {
                textView.setSingleLine(true);
                textView.setMaxLines(1);
            }
            textView2.setText(str);
            if (TextUtils.isEmpty(str)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
            }
        }
        ImageView imageView2 = n1Var.f43482c;
        if (imageView2 != null) {
            int i14 = this.f43507z0;
            if (i14 == -1) {
                drawable2 = null;
            } else {
                drawable2 = f(cursor.getString(i14));
                if (drawable2 == null) {
                    ComponentName searchActivity = this.f43498q0.getSearchActivity();
                    String flattenToShortString = searchActivity.flattenToShortString();
                    WeakHashMap weakHashMap = this.f43500s0;
                    if (weakHashMap.containsKey(flattenToShortString)) {
                        Drawable.ConstantState constantState2 = (Drawable.ConstantState) weakHashMap.get(flattenToShortString);
                        if (constantState2 == null) {
                            drawable2 = null;
                        } else {
                            drawable2 = constantState2.newDrawable(context.getResources());
                        }
                    } else {
                        PackageManager packageManager = context.getPackageManager();
                        try {
                            activityInfo = packageManager.getActivityInfo(searchActivity, 128);
                            iconResource = activityInfo.getIconResource();
                        } catch (PackageManager.NameNotFoundException e10) {
                            AbstractC3612c.r("SuggestionsAdapter", e10.toString());
                        }
                        if (iconResource != 0) {
                            Drawable drawable3 = packageManager.getDrawable(searchActivity.getPackageName(), iconResource, activityInfo.applicationInfo);
                            if (drawable3 == null) {
                                StringBuilder q10 = android.gov.nist.core.a.q("Invalid icon resource ", iconResource, " for ");
                                q10.append(searchActivity.flattenToShortString());
                                AbstractC3612c.r("SuggestionsAdapter", q10.toString());
                            } else {
                                drawable2 = drawable3;
                                if (drawable2 != null) {
                                    constantState = null;
                                } else {
                                    constantState = drawable2.getConstantState();
                                }
                                weakHashMap.put(flattenToShortString, constantState);
                            }
                        }
                        drawable2 = null;
                        if (drawable2 != null) {
                        }
                        weakHashMap.put(flattenToShortString, constantState);
                    }
                    if (drawable2 == null) {
                        drawable2 = context.getPackageManager().getDefaultActivityIcon();
                    }
                }
            }
            imageView2.setImageDrawable(drawable2);
            if (drawable2 == null) {
                imageView2.setVisibility(4);
            } else {
                imageView2.setVisibility(0);
                drawable2.setVisible(false, false);
                drawable2.setVisible(true, false);
            }
        }
        ImageView imageView3 = n1Var.f43483d;
        if (imageView3 != null) {
            int i15 = this.f43492A0;
            if (i15 == -1) {
                drawable = null;
            } else {
                drawable = f(cursor.getString(i15));
            }
            imageView3.setImageDrawable(drawable);
            if (drawable == null) {
                imageView3.setVisibility(8);
            } else {
                imageView3.setVisibility(0);
                drawable.setVisible(false, false);
                i11 = 1;
                drawable.setVisible(true, false);
                i12 = this.f43502u0;
                imageView = n1Var.f43484e;
                if (i12 == 2 && (i12 != i11 || (i10 & 1) == 0)) {
                    imageView.setVisibility(8);
                    return;
                }
                imageView.setVisibility(0);
                imageView.setTag(textView.getText());
                imageView.setOnClickListener(this);
            }
        }
        i11 = 1;
        i12 = this.f43502u0;
        imageView = n1Var.f43484e;
        if (i12 == 2) {
        }
        imageView.setVisibility(0);
        imageView.setTag(textView.getText());
        imageView.setOnClickListener(this);
    }

    @Override // I1.a
    public final void b(Cursor cursor) {
        try {
            super.b(cursor);
            if (cursor != null) {
                this.f43504w0 = cursor.getColumnIndex("suggest_text_1");
                this.f43505x0 = cursor.getColumnIndex("suggest_text_2");
                this.f43506y0 = cursor.getColumnIndex("suggest_text_2_url");
                this.f43507z0 = cursor.getColumnIndex("suggest_icon_1");
                this.f43492A0 = cursor.getColumnIndex("suggest_icon_2");
                this.f43493B0 = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e10) {
            AbstractC3612c.d("SuggestionsAdapter", "error changing cursor and caching columns", e10);
        }
    }

    @Override // I1.a
    public final String c(Cursor cursor) {
        String h10;
        String h11;
        if (cursor == null) {
            return null;
        }
        String h12 = h(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (h12 != null) {
            return h12;
        }
        SearchableInfo searchableInfo = this.f43498q0;
        if (searchableInfo.shouldRewriteQueryFromData() && (h11 = h(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return h11;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (h10 = h(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return h10;
    }

    @Override // I1.a
    public final View d(ViewGroup viewGroup) {
        View inflate = this.f43496o0.inflate(this.f43494m0, viewGroup, false);
        inflate.setTag(new n1(inflate));
        ((ImageView) inflate.findViewById(R.id.edit_query)).setImageResource(this.f43501t0);
        return inflate;
    }

    public final Drawable e(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.f43499r0.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            parseInt = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (size == 2) {
                        parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (parseInt != 0) {
                        return resourcesForApplication.getDrawable(parseInt);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        }
        throw new FileNotFoundException("No authority: " + uri);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable f(String str) {
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3 = null;
        if (str != null && !str.isEmpty() && !WebrtcBuildVersion.maint_version.equals(str)) {
            try {
                int parseInt = Integer.parseInt(str);
                String str2 = "android.resource://" + this.f43499r0.getPackageName() + Separators.SLASH + parseInt;
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f43500s0.get(str2);
                if (constantState == null) {
                    drawable2 = null;
                } else {
                    drawable2 = constantState.newDrawable();
                }
                if (drawable2 != null) {
                    return drawable2;
                }
                Context context = this.f43499r0;
                Object obj = AbstractC5042g.f41723a;
                Drawable b10 = AbstractC5038c.b(context, parseInt);
                if (b10 != null) {
                    this.f43500s0.put(str2, b10.getConstantState());
                }
                return b10;
            } catch (Resources.NotFoundException unused) {
                AbstractC3612c.r("SuggestionsAdapter", "Icon resource not found: ".concat(str));
                return null;
            } catch (NumberFormatException unused2) {
                Drawable.ConstantState constantState2 = (Drawable.ConstantState) this.f43500s0.get(str);
                if (constantState2 == null) {
                    drawable = null;
                } else {
                    drawable = constantState2.newDrawable();
                }
                if (drawable != null) {
                    return drawable;
                }
                Uri parse = Uri.parse(str);
                try {
                } catch (FileNotFoundException e10) {
                    AbstractC3612c.r("SuggestionsAdapter", "Icon not found: " + parse + ", " + e10.getMessage());
                }
                if ("android.resource".equals(parse.getScheme())) {
                    try {
                        drawable3 = e(parse);
                        if (drawable3 != null) {
                            this.f43500s0.put(str, drawable3.getConstantState());
                        }
                    } catch (Resources.NotFoundException unused3) {
                        throw new FileNotFoundException("Resource does not exist: " + parse);
                    }
                } else {
                    InputStream openInputStream = this.f43499r0.getContentResolver().openInputStream(parse);
                    if (openInputStream != null) {
                        Drawable createFromStream = Drawable.createFromStream(openInputStream, null);
                        try {
                            openInputStream.close();
                        } catch (IOException e11) {
                            AbstractC3612c.d("SuggestionsAdapter", "Error closing icon stream for " + parse, e11);
                        }
                        drawable3 = createFromStream;
                        if (drawable3 != null) {
                        }
                    } else {
                        throw new FileNotFoundException("Failed to open " + parse);
                    }
                }
                AbstractC3612c.r("SuggestionsAdapter", "Icon not found: " + parse + ", " + e10.getMessage());
                if (drawable3 != null) {
                }
            }
        }
        return drawable3;
    }

    public final Cursor g(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        fragment.appendQueryParameter("limit", String.valueOf(50));
        return this.f43499r0.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // I1.a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            AbstractC3612c.s("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View inflate = this.f43496o0.inflate(this.f43495n0, viewGroup, false);
            if (inflate != null) {
                ((n1) inflate.getTag()).f43480a.setText(e10.toString());
            }
            return inflate;
        }
    }

    @Override // I1.a, android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            AbstractC3612c.s("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View d10 = d(viewGroup);
            ((n1) d10.getTag()).f43480a.setText(e10.toString());
            return d10;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        Bundle bundle;
        super.notifyDataSetChanged();
        Cursor cursor = this.f7951h0;
        if (cursor != null) {
            bundle = cursor.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            bundle.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        Bundle bundle;
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f7951h0;
        if (cursor != null) {
            bundle = cursor.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            bundle.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f43497p0.r((CharSequence) tag);
        }
    }
}
