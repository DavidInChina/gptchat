package ti;

import android.gov.nist.core.Separators;
import java.util.regex.Pattern;
import m.C4528h;
import wi.s;

/* loaded from: classes2.dex */
public final class j extends yi.a {

    /* renamed from: e  reason: collision with root package name */
    public static final Pattern[][] f46281e = {new Pattern[]{null, null}, new Pattern[]{Pattern.compile("^<(?:script|pre|style|textarea)(?:\\s|>|$)", 2), Pattern.compile("</(?:script|pre|style|textarea)>", 2)}, new Pattern[]{Pattern.compile("^<!--"), Pattern.compile("-->")}, new Pattern[]{Pattern.compile("^<[?]"), Pattern.compile("\\?>")}, new Pattern[]{Pattern.compile("^<![A-Z]"), Pattern.compile(Separators.GREATER_THAN)}, new Pattern[]{Pattern.compile("^<!\\[CDATA\\["), Pattern.compile("\\]\\]>")}, new Pattern[]{Pattern.compile("^</?(?:address|article|aside|base|basefont|blockquote|body|caption|center|col|colgroup|dd|details|dialog|dir|div|dl|dt|fieldset|figcaption|figure|footer|form|frame|frameset|h1|h2|h3|h4|h5|h6|head|header|hr|html|iframe|legend|li|link|main|menu|menuitem|nav|noframes|ol|optgroup|option|p|param|section|source|summary|table|tbody|td|tfoot|th|thead|title|tr|track|ul)(?:\\s|[/]?[>]|$)", 2), null}, new Pattern[]{Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>])\\s*$", 2), null}};

    /* renamed from: b  reason: collision with root package name */
    public final Pattern f46283b;

    /* renamed from: a  reason: collision with root package name */
    public final wi.k f46282a = new s();

    /* renamed from: c  reason: collision with root package name */
    public boolean f46284c = false;

    /* renamed from: d  reason: collision with root package name */
    public C4528h f46285d = new C4528h(14);

    /* JADX WARN: Type inference failed for: r0v0, types: [wi.s, wi.k] */
    public j(Pattern pattern) {
        this.f46283b = pattern;
    }

    @Override // yi.a
    public final void a(xi.d dVar) {
        C4528h c4528h = this.f46285d;
        if (c4528h.f38769Y != 0) {
            ((StringBuilder) c4528h.f38770Z).append('\n');
        }
        CharSequence charSequence = dVar.f50076a;
        ((StringBuilder) c4528h.f38770Z).append(charSequence);
        c4528h.f38769Y++;
        Pattern pattern = this.f46283b;
        if (pattern != null && pattern.matcher(charSequence).find()) {
            this.f46284c = true;
        }
    }

    @Override // yi.a
    public final void e() {
        this.f46282a.f48598g = ((StringBuilder) this.f46285d.f38770Z).toString();
        this.f46285d = null;
    }

    @Override // yi.a
    public final wi.a f() {
        return this.f46282a;
    }

    @Override // yi.a
    public final a i(yi.d dVar) {
        if (this.f46284c) {
            return null;
        }
        f fVar = (f) dVar;
        if (fVar.f46265i && this.f46283b == null) {
            return null;
        }
        return a.a(fVar.f46259c);
    }
}
