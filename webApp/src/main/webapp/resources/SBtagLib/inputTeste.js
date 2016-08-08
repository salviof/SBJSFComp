PrimeFaces.widget.TesteCampo = PrimeFaces.widget.BaseWidget.extend({
    init: function (cfg) {

        this._super(cfg);

        this.jq.knob({
            draw: function () {
                //Some magic here
            }
        });
    }
});
